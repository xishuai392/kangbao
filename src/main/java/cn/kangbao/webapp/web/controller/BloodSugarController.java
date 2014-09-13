/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.common.util.BeanUtils;
import cn.kangbao.webapp.db.appmgr.entity.PatientBloodsugar;
import cn.kangbao.webapp.db.appmgr.entity.Person;
import cn.kangbao.webapp.db.appmgr.entity.SysUser;
import cn.kangbao.webapp.web.service.BloodSugarService;
import cn.kangbao.webapp.web.service.PersonService;
import cn.kangbao.webapp.web.vo.PatientBloodpressureVO;
import cn.kangbao.webapp.web.vo.PatientBloodsugarVO;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月24日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.controller <br>
 */

@Controller
public class BloodSugarController extends AbstractBaseController {

    LoggerManager logger = LoggerManager.getLogger(BloodSugarController.class);

    @Autowired
    private PersonService personService;

    @Autowired
    private BloodSugarService bloodSugarService;

    @RequestMapping(value = "/bs/addRecord.html")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("main/p_bloodsugar_add");
        SysUser newSysUser = getSessionSysUser();
        List<Person> pList = personService.getPersonByUserId(newSysUser
                .getUserid());

        if (null == getOperateContext()) {
            mav.addObject("operateContext", "");
        }

        PatientBloodsugarVO patientBloodsugarVO = new PatientBloodsugarVO();
        patientBloodsugarVO.setTesttime(new Date());
        mav.addObject("thisOperateVO", patientBloodsugarVO);

        mav.addObject("patientList", pList);

        return mav;
    }

    @RequestMapping(value = "/bs/saveRecord.json")
    @ResponseBody
    public Map save(PatientBloodsugarVO operateVO) throws BaseAppException {
        logger.debug(operateVO.toString());

        PatientBloodsugar operateDTO = new PatientBloodsugar();

        BeanUtils.copyProperties(operateVO, operateDTO);

        // 设置初始值
        operateDTO
                .setBloodsugarid(getPkSequence(IWebConstans.PATIENT_BLOODSUGAR));
        operateDTO.setCreatetime(new Date());
        operateDTO.setDr(0);
        // bpDTO.setPersonid(personid);

        boolean isOperateDone = bloodSugarService.insertRecord(operateDTO);

        return getResultMap();
    }

}
