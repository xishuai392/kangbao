package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.SysBloorstandard;
import cn.kangbao.webapp.db.appmgr.arg.SysBloorstandardArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ISysBloorstandardMapper {
    List<Integer> countByArg(SysBloorstandardArg arg);

    int deleteByArg(SysBloorstandardArg arg);

	List<SysBloorstandard> selectByArg(SysBloorstandardArg arg);

	int updateByArgSelective(@Param("record") SysBloorstandard record, @Param("arg") SysBloorstandardArg arg);

	int updateByArg(@Param("record") SysBloorstandard record, @Param("arg") SysBloorstandardArg arg);

	List<SysBloorstandard> selectByArgAndPage(SysBloorstandardArg arg, RowBounds rowBound);

	int insert(SysBloorstandard record);

	int insertSelective(SysBloorstandard record);

	int insertBatch(@Param("list")List<SysBloorstandard> records);

	int deleteByPrimaryKey(Integer bloorStdId);

	SysBloorstandard selectByPrimaryKey(Integer bloorStdId);

	int updateByPrimaryKeySelective(SysBloorstandard record);

	int updateByPrimaryKey(SysBloorstandard record);
}