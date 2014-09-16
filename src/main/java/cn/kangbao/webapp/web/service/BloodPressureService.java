/**
 * 
 */
package cn.kangbao.webapp.web.service;

import java.util.ArrayList;
import java.util.List;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kangbao.common.Page;
import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.common.util.BeanUtils;
import cn.kangbao.common.util.Utils;
import cn.kangbao.webapp.db.appmgr.arg.PatientBloodpressureArg;
import cn.kangbao.webapp.db.appmgr.arg.PatientBloodpressureArg.PatientBloodpressureCriteria;
import cn.kangbao.webapp.db.appmgr.dao.PatientBloodpressureDao;
import cn.kangbao.webapp.db.appmgr.entity.PatientBloodpressure;
import cn.kangbao.webapp.web.controller.IWebConstans;
import cn.kangbao.webapp.web.vo.PatientBloodpressureVO;

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

    /**
     * 分页查询
     * 
     * @param patientBloodpressure
     * @param page
     * @param start
     * @param limit
     * @return
     * @throws BaseAppException
     */
    public Page<PatientBloodpressureVO> selectByArgAndPage(
            PatientBloodpressureVO patientBloodpressureVO, int page, int start,
            int limit, String queryField, String queryValue, String sortName,
            String sortOrder) throws BaseAppException {
        PatientBloodpressureArg arg = new PatientBloodpressureArg();

        logger.debug("selectByArgAndPage begin...patientBloodpressure={0}",
                patientBloodpressureVO);

        PatientBloodpressureCriteria criteria = arg.createCriteria();
        // 有效值
        criteria.andDrEqualTo(IWebConstans.FIELD_DR_ACTVED);

        // 排序
        arg.setOrderByClause(sortName + " " + sortOrder);

        if (Utils.notEmpty(patientBloodpressureVO.getPersonid())) {
            criteria.andPersonidEqualTo(patientBloodpressureVO.getPersonid());
        }

        Page<PatientBloodpressureVO> resultPage = new Page<PatientBloodpressureVO>(
                page, limit);
        int offset = start;
        RowBounds rowBound = new RowBounds(offset, limit);
        List<PatientBloodpressure> pageList = patientBloodpressureDao
                .selectByArgAndPage(arg, rowBound);

        List<PatientBloodpressure> totalList = patientBloodpressureDao
                .selectByArg(arg);

        List<PatientBloodpressureVO> pageListVO = contructVOList(pageList);

        resultPage.setRows(pageListVO);
        resultPage.setTotal(totalList.size());

        return resultPage;
    }

    private List<PatientBloodpressureVO> contructVOList(
            List<PatientBloodpressure> source) {
        List<PatientBloodpressureVO> target = new ArrayList<PatientBloodpressureVO>();
        if (null == source || source.size() == 0)
            return target;
        for (PatientBloodpressure s : source) {
            PatientBloodpressureVO t = new PatientBloodpressureVO();
            BeanUtils.copyProperties(s, t);
            target.add(t);
        }
        return target;
    }

    public int batchUpdateToDisabled(String ids) {
        String[] idArray = ids.split(",");
        int i = 0;
        for (String id : idArray) {
            if (Utils.isEmpty(id.trim()))
                continue;
            PatientBloodpressure patientBloodpressure = new PatientBloodpressure();
            patientBloodpressure.setMeasurementid(Integer.parseInt(id.trim()));
            patientBloodpressure.setDr(IWebConstans.FIELD_DR_DISABLED);
            patientBloodpressureDao
                    .updateByPrimaryKeySelective(patientBloodpressure);
            i++;
        }
        return i;
    }
}
