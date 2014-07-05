package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.SysDict;
import cn.kangbao.webapp.db.appmgr.arg.SysDictArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ISysDictMapper {
    List<Integer> countByArg(SysDictArg arg);

    int deleteByArg(SysDictArg arg);

	List<SysDict> selectByArg(SysDictArg arg);

	int updateByArgSelective(@Param("record") SysDict record, @Param("arg") SysDictArg arg);

	int updateByArg(@Param("record") SysDict record, @Param("arg") SysDictArg arg);

	List<SysDict> selectByArgAndPage(SysDictArg arg, RowBounds rowBound);

	int insert(SysDict record);

	int insertSelective(SysDict record);

	int insertBatch(@Param("list")List<SysDict> records);

	int deleteByPrimaryKey(Long dictId);

	SysDict selectByPrimaryKey(Long dictId);

	int updateByPrimaryKeySelective(SysDict record);

	int updateByPrimaryKey(SysDict record);
}