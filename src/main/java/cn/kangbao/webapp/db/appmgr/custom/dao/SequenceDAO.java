package cn.kangbao.webapp.db.appmgr.custom.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.custom.mapper.ICustomSequenceMapper;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月7日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.db.appmgr.custom.dao <br>
 */
@Repository("sequenceDAO")
public class SequenceDAO {

    @Autowired
    private AppmgrSessionAndMapperSupport mapperSupport;

    public Integer selectSequence(String tableName, Integer count) {
        ICustomSequenceMapper mapper = mapperSupport.getMapper(ICustomSequenceMapper.class);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("tableName", tableName.toUpperCase());
        params.put("count", count);
        return mapper.selectSequence(params);
    }
}
