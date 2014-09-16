/**
 * 
 */
package cn.kangbao.webapp.web.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.webapp.db.appmgr.arg.SysBloorstandardArg;
import cn.kangbao.webapp.db.appmgr.arg.SysBloorstandardArg.SysBloorstandardCriteria;
import cn.kangbao.webapp.db.appmgr.dao.SysBloorstandardDao;
import cn.kangbao.webapp.db.appmgr.entity.PatientBloodpressure;
import cn.kangbao.webapp.db.appmgr.entity.SysBloorstandard;
import cn.kangbao.webapp.web.controller.IWebConstans;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年9月12日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.service <br>
 */
@Service
public class SysBloorstandardService {
    LoggerManager logger = LoggerManager
            .getLogger(SysBloorstandardService.class);

    @Autowired
    private SysBloorstandardDao sysBloorstandardDao;

    /**
     * 根据高压、低压值，获取血压标准名称，如果有多条返回的，取第一条
     * 
     * @param patientBloodpressure
     * @return
     */
    public List<SysBloorstandard> selectByArg(
            PatientBloodpressure patientBloodpressure) {
        SysBloorstandardArg arg = new SysBloorstandardArg();
        SysBloorstandardCriteria maxCri = arg.createCriteria();
        SysBloorstandardCriteria minCri = arg.or();
        maxCri.andContractmaxnumGreaterThanOrEqualTo(patientBloodpressure
                .getUpnum());
        maxCri.andContractminnumLessThanOrEqualTo(patientBloodpressure
                .getUpnum());

        minCri.andDiastolicmaxnumGreaterThanOrEqualTo(patientBloodpressure
                .getDownnum());
        minCri.andDiastolicminnumLessThanOrEqualTo(patientBloodpressure
                .getDownnum());
        arg.setOrderByClause("BLOORSTDID DESC");

        return sysBloorstandardDao.selectByArg(arg);
    }
}
