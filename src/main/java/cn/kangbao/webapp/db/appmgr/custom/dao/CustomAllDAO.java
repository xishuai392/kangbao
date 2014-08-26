/**
 * 
 */
package cn.kangbao.webapp.db.appmgr.custom.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.custom.mapper.ICustomAllMapper;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年8月26日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.db.appmgr.custom.dao <br>
 */
@Repository("customAllDAO")
public class CustomAllDAO {

    @Autowired
    private AppmgrSessionAndMapperSupport mapperSupport;

    public List<Map<String, Object>> selectPatientLivestateAndSysDict(
            Integer personid) {
        ICustomAllMapper mapper = mapperSupport
                .getMapper(ICustomAllMapper.class);
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("personid", personid);
        return mapper.selectPatientLivestateAndSysDict(paramMap);
    }
}
