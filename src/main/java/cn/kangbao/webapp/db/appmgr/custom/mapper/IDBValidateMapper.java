package cn.kangbao.webapp.db.appmgr.custom.mapper;

import cn.kangbao.webapp.db.appmgr.custom.arg.DBValidateArg;

public interface IDBValidateMapper {
    
    /**
     * Description: 判断是否存在重名。 <br> 
     *  
     * @author song.chenghao<br>
     * @param arg
     * @return <br>
     */ 
    int isSameValue(DBValidateArg arg);

}
