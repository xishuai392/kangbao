package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.Person;
import cn.kangbao.webapp.db.appmgr.arg.PersonArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IPersonMapper {
    List<Integer> countByArg(PersonArg arg);

    int deleteByArg(PersonArg arg);

	List<Person> selectByArg(PersonArg arg);

	int updateByArgSelective(@Param("record") Person record, @Param("arg") PersonArg arg);

	int updateByArg(@Param("record") Person record, @Param("arg") PersonArg arg);

	List<Person> selectByArgAndPage(PersonArg arg, RowBounds rowBound);

	int insert(Person record);

	int insertSelective(Person record);

	int insertBatch(@Param("list")List<Person> records);

	int deleteByPrimaryKey(Integer personId);

	Person selectByPrimaryKey(Integer personId);

	int updateByPrimaryKeySelective(Person record);

	int updateByPrimaryKey(Person record);
}