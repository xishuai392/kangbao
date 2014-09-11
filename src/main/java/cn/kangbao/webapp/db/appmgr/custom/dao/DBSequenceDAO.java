package cn.kangbao.webapp.db.appmgr.custom.dao;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.custom.mapper.IDBSequenceMapper;

@Repository("dbSequenceDAO")
public class DBSequenceDAO {

    @Autowired
    private AppmgrSessionAndMapperSupport mapperSupport;

    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public Integer selectSequence(String tableName, Integer count) {
        IDBSequenceMapper mapper = mapperSupport.getMapper(IDBSequenceMapper.class);
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("tableName", tableName.toUpperCase());
        params.put("count", count);
        return mapper.selectSequence(params);
    }

    @Transactional(propagation=Propagation.REQUIRES_NEW)
    public Integer maxSeq(String tableName, String colName, String idName, Integer id) {
        IDBSequenceMapper mapper = mapperSupport.getMapper(IDBSequenceMapper.class);
        return mapper.maxSeq(tableName, colName, idName, id);
    }
}
