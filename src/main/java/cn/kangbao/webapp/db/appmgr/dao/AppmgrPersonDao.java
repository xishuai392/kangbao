package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.IPersonMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.Person;

import cn.kangbao.webapp.db.appmgr.arg.PersonArg;
import cn.kangbao.webapp.db.appmgr.arg.PersonArg.PersonCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class AppmgrPersonDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(PersonArg arg){
		IPersonMapper mapper = mapperSupport.getMapper(IPersonMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(PersonArg arg){
		IPersonMapper mapper = mapperSupport.getMapper(IPersonMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<Person> selectByArg(PersonArg arg){
		IPersonMapper mapper = mapperSupport.getMapper(IPersonMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(Person record,PersonArg arg){
		IPersonMapper mapper = mapperSupport.getMapper(IPersonMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(Person record,PersonArg arg){
		IPersonMapper mapper = mapperSupport.getMapper(IPersonMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<Person> selectByArgAndPage(PersonArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		IPersonMapper mapper = mapperSupport.getMapper(IPersonMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(Person record){
		IPersonMapper mapper = mapperSupport.getMapper(IPersonMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(Person record){
		IPersonMapper mapper = mapperSupport.getMapper(IPersonMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<Person> records){
		SqlSession session = mapperSupport.getSession();
		session.commit();
		try {
			IPersonMapper mapper = session.getMapper(IPersonMapper.class);
			return mapper.insertBatch(records);
		 } catch (Exception e) {
			session.rollback();
			throw new RuntimeException(e);
		}
		finally{
			session.close();
		}
	}

	public int deleteByPrimaryKey(Integer key){
		IPersonMapper mapper = mapperSupport.getMapper(IPersonMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public Person selectByPrimaryKey(Integer key){
		IPersonMapper mapper = mapperSupport.getMapper(IPersonMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(Person record){
		IPersonMapper mapper = mapperSupport.getMapper(IPersonMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Person record){
		IPersonMapper mapper = mapperSupport.getMapper(IPersonMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<Person> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private PersonArg buildQueryObject(Map<String, String> params) {

		PersonArg arg = new PersonArg();
		PersonCriteria criteria = arg.createCriteria();

		Class criteriaClass = criteria.getClass();
		Set keys = params.keySet( );
		 
		if(keys != null) {
		 
		Iterator iterator = keys.iterator( );
		 
		while(iterator.hasNext( )) {
		 
		Object key = iterator.next( );
		Object value = params.get(key);
		for (Method method : criteriaClass.getMethods()) {
			if (method.getName().equals(
					"and" + key.toString().toUpperCase()
							+ "EqualTo")) {
				try {
					method.invoke(criteria, value);
				} catch (Exception e) {
					throw new RuntimeException(e);
				}
				break;
			}
		}
		}
		}
		return arg;
	}
}
