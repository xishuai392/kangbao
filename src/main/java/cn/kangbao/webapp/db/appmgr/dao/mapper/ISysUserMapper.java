package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.SysUser;
import cn.kangbao.webapp.db.appmgr.arg.SysUserArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ISysUserMapper {
    List<Integer> countByArg(SysUserArg arg);

    int deleteByArg(SysUserArg arg);

	List<SysUser> selectByArg(SysUserArg arg);

	int updateByArgSelective(@Param("record") SysUser record, @Param("arg") SysUserArg arg);

	int updateByArg(@Param("record") SysUser record, @Param("arg") SysUserArg arg);

	List<SysUser> selectByArgAndPage(SysUserArg arg, RowBounds rowBound);

	int insert(SysUser record);

	int insertSelective(SysUser record);

	int insertBatch(@Param("list")List<SysUser> records);

	int deleteByPrimaryKey(Integer userId);

	SysUser selectByPrimaryKey(Integer userId);

	int updateByPrimaryKeySelective(SysUser record);

	int updateByPrimaryKey(SysUser record);
}