/**
 * 
 */
package cn.kangbao.webapp.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.webapp.db.appmgr.dao.PatientBloodsugarDao;
import cn.kangbao.webapp.db.appmgr.entity.PatientBloodsugar;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月24日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.service <br>
 */
@Service
public class BloodSugarService {
    LoggerManager logger = LoggerManager.getLogger(BloodSugarService.class);

    @Autowired
    private  PatientBloodsugarDao patientBloodsugarDao;

    public boolean insertRecord(PatientBloodsugar record) {
        int i = patientBloodsugarDao.insertSelective(record);
        logger.debug("insertRecord finished,count=" + i);
        return true;
    }
}
