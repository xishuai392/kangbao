/**
 * 
 */
package cn.kangbao.webapp.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.webapp.db.appmgr.dao.PatientBloodpressureDao;
import cn.kangbao.webapp.db.appmgr.entity.PatientBloodpressure;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月22日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.service <br>
 */
@Service
public class BloodPressureService {

    LoggerManager logger = LoggerManager.getLogger(BloodPressureService.class);

    @Autowired
    private PatientBloodpressureDao patientBloodpressureDao;

    public boolean insertRecord(PatientBloodpressure record) {
        int i = patientBloodpressureDao.insertSelective(record);
        logger.debug("insertRecord finished,count=" + i);
        return true;
    }
}
