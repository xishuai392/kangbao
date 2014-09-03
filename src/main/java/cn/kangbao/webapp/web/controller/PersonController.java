/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.common.util.BeanUtils;
import cn.kangbao.webapp.db.appmgr.entity.PatientHealth;
import cn.kangbao.webapp.db.appmgr.entity.PatientLivestate;
import cn.kangbao.webapp.db.appmgr.entity.Person;
import cn.kangbao.webapp.db.appmgr.entity.SysUser;
import cn.kangbao.webapp.web.service.PatientHealthService;
import cn.kangbao.webapp.web.service.PatientLiveStateService;
import cn.kangbao.webapp.web.service.PersonService;
import cn.kangbao.webapp.web.vo.PersonVO;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年8月8日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.controller <br>
 */
@Controller
@Scope("prototype")
@RequestMapping("/person")
public class PersonController extends AbstractBaseController {

    LoggerManager logger = LoggerManager.getLogger(PersonController.class);

    @Autowired
    private PersonService personService;

    @Autowired
    private PatientHealthService patientHealthService;

    @Autowired
    private PatientLiveStateService patientLiveStateService;

    @RequestMapping(value = "/index.html")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("main/person");
        // ModelAndView mav = new ModelAndView("main/person");
        SysUser newSysUser = getSessionSysUser();
        List<Person> pList = personService.getPersonByUserId(newSysUser
                .getUserid());
        // getRequest().setAttribute("pList", pList);

        if (null == getOperateContext()) {
            mav.addObject("operateContext", "");
        }

        mav.addObject("pList", pList);
        return mav;
    }

    @RequestMapping(value = "/jumpToAdd.html")
    public ModelAndView jumpToAdd() throws BaseAppException {
        ModelAndView mav = new ModelAndView("main/person_operate");
        operateType = IWebConstans.OPERATE_ADD;
        SysUser sessionUser = getSessionSysUser();
        Person sessionMainPerson = getSessionMainPerson();
        if (null == sessionUser) {
            throw new BaseAppException("查询不到登录用户！");
        }
        if (null == sessionMainPerson) {
            throw new BaseAppException("查询不到登录用户关联的信息！");
        }

        PersonVO personVO = new PersonVO();
        personVO.setUserid(sessionUser.getUserid());
        personVO.setMainpersonid(sessionMainPerson.getPersonid());

        mav.addObject("operateType", operateType);
        mav.addObject("thisPersonVO", personVO);
        return mav;
    }

    @RequestMapping(value = "/jumpToModify.html")
    public ModelAndView jumpToModify(@RequestParam("personId") int personId,
            Model model) throws BaseAppException {
        ModelAndView mav = new ModelAndView("main/person_operate");
        operateType = IWebConstans.OPERATE_UPDATE;
        Person person = personService.selectByPersonId(personId);
        if (null == person) {
            throw new BaseAppException("查询不到该成员！");
        }

        List<PatientHealth> patientHealthList = patientHealthService
                .getPatientHealthListByPersonId(personId);
        PatientHealth thizPatientHealth = null;
        if (null != patientHealthList && patientHealthList.size() > 0) {
            thizPatientHealth = patientHealthList.get(0);
        }

        PersonVO personVO = new PersonVO();
        BeanUtils.copyProperties(person, personVO);
        if (null != thizPatientHealth) {
            BeanUtils.copyProperties(thizPatientHealth, personVO);
        }

        // model.addAttribute("thisPersonVO", personVO);

        // 填充已经选择的livestate
        personService.selectPatientLivestateToPersonVOByPersonId(personVO,
                personVO.getPersonid());

        mav.addObject("operateType", operateType);
        mav.addObject("thisPersonVO", personVO);
        return mav;
    }

    // save.html
    @RequestMapping(value = "/save.html")
    public ModelAndView save(PersonVO personVO, @RequestParam String operateType)
            throws BaseAppException {
        ModelAndView mav = new ModelAndView("main/person_operate");

        boolean isOperateDone = false;
        if (IWebConstans.OPERATE_ADD.equals(operateType)) {
            // 添加
            Person person = new Person();

            PatientHealth patientHealth = new PatientHealth();
            BeanUtils.copyProperties(personVO, person);
            BeanUtils.copyProperties(personVO, patientHealth);

            person.setPersonid(getPkSequence(IWebConstans.PERSON));
            person.setCreatetime(new Date());
            person.setDr(IWebConstans.FIELD_DR_ACTVED);
            person.setUsertype(IWebConstans.USERTYPE_PATIENT);

            patientHealth
                    .setHealthid(getPkSequence(IWebConstans.PATIENT_HEALTH));
            patientHealth.setCreatetime(new Date());
            patientHealth.setDr(IWebConstans.FIELD_DR_ACTVED);

            // 更新成将要添加的这个的id，因为PatientLivestate要用到这个id
            patientHealth.setPersonid(person.getPersonid());
            personVO.setPersonid(person.getPersonid());

            List<PatientLivestate> patientLivestateList = buildPatientLivestateList(personVO);
            isOperateDone = personService.insertPersonAndHealthAndLiveState(
                    person, patientHealth, patientLivestateList);
        }

        if (IWebConstans.OPERATE_UPDATE.equals(operateType)) {
            // 修改
            Person person = new Person();
            PatientHealth patientHealth = new PatientHealth();
            BeanUtils.copyProperties(personVO, person);
            BeanUtils.copyProperties(personVO, patientHealth);

            List<PatientLivestate> patientLivestateList = buildPatientLivestateList(personVO);
            isOperateDone = personService.updatePersonAndHealthAndLiveState(
                    person, patientHealth, patientLivestateList);
        }

        if (IWebConstans.OPERATE_DELETE.equals(operateType)) {
            // 删除
        }

        if (isOperateDone) {
            setOperateContext("操作成功！");
        }
        else {
            setOperateContext("操作失败！");
        }

        mav.addObject("isOperateDone", isOperateDone);

        mav.addObject("operateContext", getOperateContext());
        return index(mav);
    }

    @RequestMapping(value = "/delete.json", method = RequestMethod.POST)
    @ResponseBody
    public Map delete(PersonVO personVO) throws BaseAppException {
        logger.debug("delete personVO begin...personVO=[{0}]", personVO);
        // personService.deletePersonAndHealthAndLiveState(personVO);
        return getResultMap();
    }

    private List<PatientLivestate> buildPatientLivestateList(PersonVO personVO)
            throws BaseAppException {
        List<PatientLivestate> patientLivestateList = new ArrayList<PatientLivestate>();
        if (null == personVO)
            return patientLivestateList;
        if (null != personVO.getLivestate_danguchun()) {
            PatientLivestate patientLivestate = buildPatientLivestate(personVO);
            patientLivestate.setLiveitem(Integer.parseInt(personVO
                    .getLivestate_danguchun()));
            patientLivestateList.add(patientLivestate);
        }
        if (null != personVO.getLivestate_hejiu()) {
            PatientLivestate patientLivestate = buildPatientLivestate(personVO);
            patientLivestate.setLiveitem(Integer.parseInt(personVO
                    .getLivestate_hejiu()));
            patientLivestateList.add(patientLivestate);
        }
        if (null != personVO.getLivestate_qingxu()) {
            PatientLivestate patientLivestate = buildPatientLivestate(personVO);
            patientLivestate.setLiveitem(Integer.parseInt(personVO
                    .getLivestate_qingxu()));
            patientLivestateList.add(patientLivestate);
        }
        if (null != personVO.getLivestate_shuimian()) {
            PatientLivestate patientLivestate = buildPatientLivestate(personVO);
            patientLivestate.setLiveitem(Integer.parseInt(personVO
                    .getLivestate_shuimian()));
            patientLivestateList.add(patientLivestate);
        }
        if (null != personVO.getLivestate_tangniaobing()) {
            PatientLivestate patientLivestate = buildPatientLivestate(personVO);
            patientLivestate.setLiveitem(Integer.parseInt(personVO
                    .getLivestate_tangniaobing()));
            patientLivestateList.add(patientLivestate);
        }
        if (null != personVO.getLivestate_tixing()) {
            PatientLivestate patientLivestate = buildPatientLivestate(personVO);
            patientLivestate.setLiveitem(Integer.parseInt(personVO
                    .getLivestate_tixing()));
            patientLivestateList.add(patientLivestate);
        }
        if (null != personVO.getLivestate_xiyan()) {
            PatientLivestate patientLivestate = buildPatientLivestate(personVO);
            patientLivestate.setLiveitem(Integer.parseInt(personVO
                    .getLivestate_xiyan()));
            patientLivestateList.add(patientLivestate);
        }
        if (null != personVO.getLivestate_xuetang()) {
            PatientLivestate patientLivestate = buildPatientLivestate(personVO);
            patientLivestate.setLiveitem(Integer.parseInt(personVO
                    .getLivestate_xuetang()));
            patientLivestateList.add(patientLivestate);
        }
        if (null != personVO.getLivestate_xuezhi()) {
            PatientLivestate patientLivestate = buildPatientLivestate(personVO);
            patientLivestate.setLiveitem(Integer.parseInt(personVO
                    .getLivestate_xuezhi()));
            patientLivestateList.add(patientLivestate);
        }
        if (null != personVO.getLivestate_yinshi()) {
            PatientLivestate patientLivestate = buildPatientLivestate(personVO);
            patientLivestate.setLiveitem(Integer.parseInt(personVO
                    .getLivestate_yinshi()));
            patientLivestateList.add(patientLivestate);
        }
        if (null != personVO.getLivestate_yundong()) {
            PatientLivestate patientLivestate = buildPatientLivestate(personVO);
            patientLivestate.setLiveitem(Integer.parseInt(personVO
                    .getLivestate_yundong()));
            patientLivestateList.add(patientLivestate);
        }
        return patientLivestateList;
    }

    private PatientLivestate buildPatientLivestate(PersonVO personVO)
            throws BaseAppException {
        PatientLivestate patientLivestate = new PatientLivestate();
        patientLivestate
                .setLivestateid(getPkSequence(IWebConstans.PATIENT_LIVESTATE));
        patientLivestate.setPersonid(personVO.getPersonid());
        patientLivestate.setLivestate("Y");
        patientLivestate.setCreatetime(new Date());
        patientLivestate.setDr(IWebConstans.FIELD_DR_ACTVED);
        return patientLivestate;
    }

}
