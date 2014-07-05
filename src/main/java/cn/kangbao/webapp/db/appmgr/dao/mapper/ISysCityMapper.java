package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.SysCity;
import cn.kangbao.webapp.db.appmgr.arg.SysCityArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ISysCityMapper {
    List<Integer> countByArg(SysCityArg arg);

    int deleteByArg(SysCityArg arg);

	List<SysCity> selectByArg(SysCityArg arg);

	int updateByArgSelective(@Param("record") SysCity record, @Param("arg") SysCityArg arg);

	int updateByArg(@Param("record") SysCity record, @Param("arg") SysCityArg arg);

	List<SysCity> selectByArgAndPage(SysCityArg arg, RowBounds rowBound);

	int insert(SysCity record);

	int insertSelective(SysCity record);

	int insertBatch(@Param("list")List<SysCity> records);

	int deleteByPrimaryKey(Integer cityId);

	SysCity selectByPrimaryKey(Integer cityId);

	int updateByPrimaryKeySelective(SysCity record);

	int updateByPrimaryKey(SysCity record);
}