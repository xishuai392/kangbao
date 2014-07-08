package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.SysKeytable;
import cn.kangbao.webapp.db.appmgr.arg.SysKeytableArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ISysKeytableMapper {
    List<Integer> countByArg(SysKeytableArg arg);

    int deleteByArg(SysKeytableArg arg);

	List<SysKeytable> selectByArg(SysKeytableArg arg);

	int updateByArgSelective(@Param("record") SysKeytable record, @Param("arg") SysKeytableArg arg);

	int updateByArg(@Param("record") SysKeytable record, @Param("arg") SysKeytableArg arg);

	List<SysKeytable> selectByArgAndPage(SysKeytableArg arg, RowBounds rowBound);

	int insert(SysKeytable record);

	int insertSelective(SysKeytable record);

	int insertBatch(@Param("list")List<SysKeytable> records);

	int deleteByPrimaryKey(String tableName);

	SysKeytable selectByPrimaryKey(String tableName);

	int updateByPrimaryKeySelective(SysKeytable record);

	int updateByPrimaryKey(SysKeytable record);
}