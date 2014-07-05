package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.SysMessage;
import cn.kangbao.webapp.db.appmgr.arg.SysMessageArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ISysMessageMapper {
    List<Integer> countByArg(SysMessageArg arg);

    int deleteByArg(SysMessageArg arg);

	List<SysMessage> selectByArg(SysMessageArg arg);

	int updateByArgSelective(@Param("record") SysMessage record, @Param("arg") SysMessageArg arg);

	int updateByArg(@Param("record") SysMessage record, @Param("arg") SysMessageArg arg);

	List<SysMessage> selectByArgAndPage(SysMessageArg arg, RowBounds rowBound);

	int insert(SysMessage record);

	int insertSelective(SysMessage record);

	int insertBatch(@Param("list")List<SysMessage> records);

	int deleteByPrimaryKey(Integer messageId);

	SysMessage selectByPrimaryKey(Integer messageId);

	int updateByPrimaryKeySelective(SysMessage record);

	int updateByPrimaryKey(SysMessage record);
}