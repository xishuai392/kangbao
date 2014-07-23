/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.webapp.db.appmgr.entity.PatientBloodpressure;
import cn.kangbao.webapp.web.service.BloodPressureService;

/**
 * 血压 <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月21日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.controller <br>
 */

@Controller
@RequestMapping("/bp")
public class BloodPressureController extends AbstractBaseController {
    LoggerManager logger = LoggerManager.getLogger(BloodPressureController.class);

    @Autowired
    private BloodPressureService bloodPressureService;

    @RequestMapping(value = "/addRecord.html")
    public String index(Model model) {

        return "main/p_bloodpressure_add";
    }

    @RequestMapping(value = "/saveRecord.html")
    public String save(PatientBloodpressure bpDTO) throws BaseAppException {
        logger.debug(bpDTO.toString());

        // 设置初始值
        bpDTO.setMeasurementid(getPkSequence(IWebConstans.PATIENT_BLOODPRESSURE));
        bpDTO.setCreatetime(new Date());
        bpDTO.setDr(0);
        // bpDTO.setPersonid(personid);

        bloodPressureService.insertRecord(bpDTO);
        return index(null);
    }

}
