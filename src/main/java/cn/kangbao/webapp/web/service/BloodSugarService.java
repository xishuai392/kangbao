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
import cn.kangbao.webapp.db.appmgr.arg.PatientBloodsugarArg;
import cn.kangbao.webapp.db.appmgr.arg.PatientBloodsugarArg.PatientBloodsugarCriteria;
import cn.kangbao.webapp.db.appmgr.dao.PatientBloodsugarDao;
import cn.kangbao.webapp.db.appmgr.entity.PatientBloodsugar;
import cn.kangbao.webapp.web.controller.IWebConstans;
import cn.kangbao.webapp.web.vo.PatientBloodsugarVO;

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
    private PatientBloodsugarDao patientBloodsugarDao;

    public boolean insertRecord(PatientBloodsugar record) {
        int i = patientBloodsugarDao.insertSelective(record);
        logger.debug("insertRecord finished,count=" + i);
        return true;
    }

    /**
     * 分页查询
     * 
     * @param patientBloodsugarVO
     * @param page
     * @param start
     * @param limit
     * @param queryField
     * @param queryValue
     * @param sortName
     * @param sortOrder
     * @return
     * @throws BaseAppException
     */
    public Page<PatientBloodsugarVO> selectByArgAndPage(
            PatientBloodsugarVO patientBloodsugarVO, int page, int start,
            int limit, String queryField, String queryValue, String sortName,
            String sortOrder) throws BaseAppException {
        PatientBloodsugarArg arg = new PatientBloodsugarArg();

        logger.debug("selectByArgAndPage begin...patientBloodsugarVO={0}",
                patientBloodsugarVO);

        PatientBloodsugarCriteria criteria = arg.createCriteria();
        // 有效值
        criteria.andDrEqualTo(IWebConstans.FIELD_DR_ACTVED);

        // 排序
        arg.setOrderByClause(sortName + " " + sortOrder);

        if (Utils.notEmpty(patientBloodsugarVO.getPersonid())) {
            criteria.andPersonidEqualTo(patientBloodsugarVO.getPersonid());
        }

        Page<PatientBloodsugarVO> resultPage = new Page<PatientBloodsugarVO>(
                page, limit);
        int offset = start;
        RowBounds rowBound = new RowBounds(offset, limit);
        List<PatientBloodsugar> pageList = patientBloodsugarDao
                .selectByArgAndPage(arg, rowBound);

        List<PatientBloodsugar> totalList = patientBloodsugarDao
                .selectByArg(arg);

        List<PatientBloodsugarVO> pageListVO = contructVOList(pageList);

        resultPage.setRows(pageListVO);
        resultPage.setTotal(totalList.size());

        return resultPage;
    }

    private List<PatientBloodsugarVO> contructVOList(
            List<PatientBloodsugar> source) {
        List<PatientBloodsugarVO> target = new ArrayList<PatientBloodsugarVO>();
        if (null == source || source.size() == 0)
            return target;
        for (PatientBloodsugar s : source) {
            PatientBloodsugarVO t = new PatientBloodsugarVO();
            BeanUtils.copyProperties(s, t);
            target.add(t);
        }
        return target;
    }

    /**
     * 批量删除——更新为失效状态
     * 
     * @param ids
     * @return
     */
    public int batchUpdateToDisabled(String ids) {
        String[] idArray = ids.split(",");
        int i = 0;
        for (String id : idArray) {
            if (Utils.isEmpty(id.trim()))
                continue;
            PatientBloodsugar patientBloodsugar = new PatientBloodsugar();
            patientBloodsugar.setBloodsugarid(Integer.parseInt(id.trim()));
            patientBloodsugar.setDr(IWebConstans.FIELD_DR_DISABLED);
            patientBloodsugarDao.updateByPrimaryKeySelective(patientBloodsugar);
            i++;
        }
        return i;
    }

}
