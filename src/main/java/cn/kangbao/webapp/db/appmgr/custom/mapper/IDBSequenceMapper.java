package cn.kangbao.webapp.db.appmgr.custom.mapper;

import java.util.Map;

import org.apache.ibatis.annotations.Param;

public interface IDBSequenceMapper {
    Integer selectSequence(Map<String, Object> params);
    
    /**
     * Description: 查询指定表中在一个主键指定情况下另外一个字段的最大值<br> 
     *  
     * @author song.chenghao<br>
     * @param tableName
     * @param colName
     * @param idName
     * @param id
     * @return <br>
     */ 
    Integer maxSeq(@Param("tableName") String tableName, @Param("colName") String colName, @Param("idName") String idName,
        @Param("id") Integer id);
}
