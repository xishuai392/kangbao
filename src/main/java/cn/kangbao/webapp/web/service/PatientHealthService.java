/**
 * 
 */
package cn.kangbao.webapp.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kangbao.webapp.db.appmgr.arg.PatientHealthArg;
import cn.kangbao.webapp.db.appmgr.arg.PatientHealthArg.PatientHealthCriteria;
import cn.kangbao.webapp.db.appmgr.dao.PatientHealthDao;
import cn.kangbao.webapp.db.appmgr.entity.PatientHealth;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年8月23日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.service <br>
 */
@Service
public class PatientHealthService {
    @Autowired
    private  PatientHealthDao patientHealthDao;

    /**
     * 根据personId获取其对应的健康信息
     * 
     * @param personId
     * @return
     */
    public List<PatientHealth> getPatientHealthListByPersonId(int personId) {
        PatientHealthArg arg = new PatientHealthArg();
        PatientHealthCriteria crit = arg.createCriteria();
        crit.andPersonidEqualTo(personId);
        crit.andDrEqualTo(0);
        List<PatientHealth> resultList = patientHealthDao.selectByArg(arg);
        return resultList;
    }
}
