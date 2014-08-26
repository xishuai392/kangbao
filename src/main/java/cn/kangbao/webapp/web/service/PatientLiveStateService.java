/**
 * 
 */
package cn.kangbao.webapp.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kangbao.webapp.db.appmgr.arg.PatientLivestateArg;
import cn.kangbao.webapp.db.appmgr.arg.PatientLivestateArg.PatientLivestateCriteria;
import cn.kangbao.webapp.db.appmgr.dao.AppmgrPatientLivestateDao;
import cn.kangbao.webapp.db.appmgr.entity.PatientLivestate;

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
public class PatientLiveStateService {

    @Autowired
    private AppmgrPatientLivestateDao appmgrPatientLivestateDao;

    /**
     * 根据PersonId返回所有符合条件的生活状态
     * 
     * @param personId
     * @return
     */
    public List<PatientLivestate> getPatientLivestateListByPsersonId(int personId) {
        PatientLivestateArg arg = new PatientLivestateArg();
        PatientLivestateCriteria crit = arg.createCriteria();
        crit.andPersonidEqualTo(personId);
        crit.andDrEqualTo(0);
        return appmgrPatientLivestateDao.selectByArg(arg);
    }
}
