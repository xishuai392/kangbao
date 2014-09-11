package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.ISysDictMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.SysDict;

import cn.kangbao.webapp.db.appmgr.arg.SysDictArg;
import cn.kangbao.webapp.db.appmgr.arg.SysDictArg.SysDictCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class SysDictDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(SysDictArg arg){
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(SysDictArg arg){
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<SysDict> selectByArg(SysDictArg arg){
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(SysDict record,SysDictArg arg){
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(SysDict record,SysDictArg arg){
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<SysDict> selectByArgAndPage(SysDictArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(SysDict record){
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(SysDict record){
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<SysDict> records){
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.insertBatch(records);
	}

	public int deleteByPrimaryKey(Long key){
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public SysDict selectByPrimaryKey(Long key){
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(SysDict record){
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(SysDict record){
		ISysDictMapper mapper = mapperSupport.getMapper(ISysDictMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<SysDict> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private SysDictArg buildQueryObject(Map<String, String> params) {

		SysDictArg arg = new SysDictArg();
		SysDictCriteria criteria = arg.createCriteria();

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
