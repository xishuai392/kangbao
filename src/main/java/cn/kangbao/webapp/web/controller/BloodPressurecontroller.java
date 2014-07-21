/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.webapp.db.appmgr.entity.PatientBloodpressure;

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
public class BloodPressurecontroller extends AbstractBaseController {
    LoggerManager logger = LoggerManager.getLogger(BloodPressurecontroller.class);

    @RequestMapping(value = "/addRecord.html")
    public String index(Model model) {

        return "main/p_bloodpressure_add";
    }

    @RequestMapping(value = "/saveRecord.html")
    public String save(PatientBloodpressure bpDTO) {
        logger.debug(bpDTO.toString());
        return index(null);
    }
}
