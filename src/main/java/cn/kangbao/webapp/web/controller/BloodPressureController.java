/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import java.util.Date;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.common.util.BeanUtils;
import cn.kangbao.webapp.db.appmgr.entity.PatientBloodpressure;
import cn.kangbao.webapp.db.appmgr.entity.Person;
import cn.kangbao.webapp.db.appmgr.entity.SysUser;
import cn.kangbao.webapp.web.service.BloodPressureService;
import cn.kangbao.webapp.web.service.PersonService;
import cn.kangbao.webapp.web.vo.PatientBloodpressureVO;

/**
 * <Description>血压 <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月21日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.controller <br>
 */

@Controller
@Scope("prototype")
public class BloodPressureController extends AbstractBaseController {
    LoggerManager logger = LoggerManager
            .getLogger(BloodPressureController.class);

    @Autowired
    private BloodPressureService bloodPressureService;

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/bp/addRecord.html")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("main/p_bloodpressure_add");
        SysUser newSysUser = getSessionSysUser();
        List<Person> pList = personService.getPersonByUserId(newSysUser
                .getUserid());

        if (null == getOperateContext()) {
            mav.addObject("operateContext", "");
        }

        PatientBloodpressureVO patientBloodpressureVO = new PatientBloodpressureVO();
        patientBloodpressureVO.setTesttime(new Date());
        mav.addObject("thisOperateVO", patientBloodpressureVO);

        mav.addObject("patientList", pList);

        return mav;
    }

    @RequestMapping(value = "/bp/saveRecord.json")
    @ResponseBody
    public Map save(PatientBloodpressureVO operateVO)
            throws BaseAppException {
        logger.debug(operateVO.toString());

        PatientBloodpressure operateDTO = new PatientBloodpressure();

        BeanUtils.copyProperties(operateVO, operateDTO);

        // 设置初始值
        operateDTO.setMeasurementid(getPkSequence(IWebConstans.PATIENT_BLOODPRESSURE));
        operateDTO.setCreatetime(new Date());
        operateDTO.setDr(0);
        // bpDTO.setPersonid(personid);

        boolean isOperateDone = bloodPressureService.insertRecord(operateDTO);

        return getResultMap();
    }

}
