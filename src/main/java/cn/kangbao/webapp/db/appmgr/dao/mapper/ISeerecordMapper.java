package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.Seerecord;
import cn.kangbao.webapp.db.appmgr.arg.SeerecordArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface ISeerecordMapper {
    List<Integer> countByArg(SeerecordArg arg);

    int deleteByArg(SeerecordArg arg);

	List<Seerecord> selectByArg(SeerecordArg arg);

	int updateByArgSelective(@Param("record") Seerecord record, @Param("arg") SeerecordArg arg);

	int updateByArg(@Param("record") Seerecord record, @Param("arg") SeerecordArg arg);

	List<Seerecord> selectByArgAndPage(SeerecordArg arg, RowBounds rowBound);

	int insert(Seerecord record);

	int insertSelective(Seerecord record);

	int insertBatch(@Param("list")List<Seerecord> records);

	int deleteByPrimaryKey(Integer caseId);

	Seerecord selectByPrimaryKey(Integer caseId);

	int updateByPrimaryKeySelective(Seerecord record);

	int updateByPrimaryKey(Seerecord record);
}