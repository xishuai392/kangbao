/**
 * 
 */
package cn.kangbao.webapp.web.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kangbao.webapp.db.appmgr.dao.AppmgrPatientBloodpressureDao;
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

    @Autowired
    private AppmgrPatientBloodpressureDao appmgrPatientBloodpressureDao;

    public boolean insertRecord(PatientBloodpressure record) {
        int i = appmgrPatientBloodpressureDao.insert(record);
        return true;
    }
}
