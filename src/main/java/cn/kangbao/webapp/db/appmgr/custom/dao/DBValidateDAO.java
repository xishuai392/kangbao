package cn.kangbao.webapp.db.appmgr.custom.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.custom.arg.DBValidateArg;
import cn.kangbao.webapp.db.appmgr.custom.mapper.IDBValidateMapper;

@Repository(value = "dbValidateDAO")
public class DBValidateDAO {
    @Autowired
    private AppmgrSessionAndMapperSupport mapperSupport;

    public int isSameValue(DBValidateArg arg) {
        IDBValidateMapper mapper = mapperSupport.getMapper(IDBValidateMapper.class);
        return mapper.isSameValue(arg);
    }

    
}
