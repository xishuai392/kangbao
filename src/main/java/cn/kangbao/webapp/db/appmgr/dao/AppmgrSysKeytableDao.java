package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.ISysKeytableMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.SysKeytable;

import cn.kangbao.webapp.db.appmgr.arg.SysKeytableArg;
import cn.kangbao.webapp.db.appmgr.arg.SysKeytableArg.SysKeytableCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class AppmgrSysKeytableDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(SysKeytableArg arg){
		ISysKeytableMapper mapper = mapperSupport.getMapper(ISysKeytableMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(SysKeytableArg arg){
		ISysKeytableMapper mapper = mapperSupport.getMapper(ISysKeytableMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<SysKeytable> selectByArg(SysKeytableArg arg){
		ISysKeytableMapper mapper = mapperSupport.getMapper(ISysKeytableMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(SysKeytable record,SysKeytableArg arg){
		ISysKeytableMapper mapper = mapperSupport.getMapper(ISysKeytableMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(SysKeytable record,SysKeytableArg arg){
		ISysKeytableMapper mapper = mapperSupport.getMapper(ISysKeytableMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<SysKeytable> selectByArgAndPage(SysKeytableArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			arg.setOrderByClause( "tableId" +" desc");
		}
		ISysKeytableMapper mapper = mapperSupport.getMapper(ISysKeytableMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(SysKeytable record){
		ISysKeytableMapper mapper = mapperSupport.getMapper(ISysKeytableMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(SysKeytable record){
		ISysKeytableMapper mapper = mapperSupport.getMapper(ISysKeytableMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<SysKeytable> records){
		SqlSession session = mapperSupport.getSession();
		session.commit();
		try {
			ISysKeytableMapper mapper = session.getMapper(ISysKeytableMapper.class);
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
		ISysKeytableMapper mapper = mapperSupport.getMapper(ISysKeytableMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public SysKeytable selectByPrimaryKey(Integer key){
		ISysKeytableMapper mapper = mapperSupport.getMapper(ISysKeytableMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(SysKeytable record){
		ISysKeytableMapper mapper = mapperSupport.getMapper(ISysKeytableMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(SysKeytable record){
		ISysKeytableMapper mapper = mapperSupport.getMapper(ISysKeytableMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<SysKeytable> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private SysKeytableArg buildQueryObject(Map<String, String> params) {

		SysKeytableArg arg = new SysKeytableArg();
		SysKeytableCriteria criteria = arg.createCriteria();

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
