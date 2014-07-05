package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.MessageUser;
import cn.kangbao.webapp.db.appmgr.entity.MessageUserKey;
import cn.kangbao.webapp.db.appmgr.arg.MessageUserArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IMessageUserMapper {
    List<Integer> countByArg(MessageUserArg arg);

    int deleteByArg(MessageUserArg arg);

	List<MessageUser> selectByArg(MessageUserArg arg);

	int updateByArgSelective(@Param("record") MessageUser record, @Param("arg") MessageUserArg arg);

	int updateByArg(@Param("record") MessageUser record, @Param("arg") MessageUserArg arg);

	List<MessageUser> selectByArgAndPage(MessageUserArg arg, RowBounds rowBound);

	int insert(MessageUser record);

	int insertSelective(MessageUser record);

	int insertBatch(@Param("list")List<MessageUser> records);

	int deleteByPrimaryKey(MessageUserKey key);

	MessageUser selectByPrimaryKey(MessageUserKey key);

	int updateByPrimaryKeySelective(MessageUser record);

	int updateByPrimaryKey(MessageUser record);
}