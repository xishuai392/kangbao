package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.ISysBloorstandardMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.SysBloorstandard;

import cn.kangbao.webapp.db.appmgr.arg.SysBloorstandardArg;
import cn.kangbao.webapp.db.appmgr.arg.SysBloorstandardArg.SysBloorstandardCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class SysBloorstandardDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(SysBloorstandardArg arg){
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(SysBloorstandardArg arg){
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<SysBloorstandard> selectByArg(SysBloorstandardArg arg){
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(SysBloorstandard record,SysBloorstandardArg arg){
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(SysBloorstandard record,SysBloorstandardArg arg){
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<SysBloorstandard> selectByArgAndPage(SysBloorstandardArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(SysBloorstandard record){
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(SysBloorstandard record){
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<SysBloorstandard> records){
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.insertBatch(records);
	}

	public int deleteByPrimaryKey(Integer key){
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public SysBloorstandard selectByPrimaryKey(Integer key){
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(SysBloorstandard record){
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(SysBloorstandard record){
		ISysBloorstandardMapper mapper = mapperSupport.getMapper(ISysBloorstandardMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<SysBloorstandard> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private SysBloorstandardArg buildQueryObject(Map<String, String> params) {

		SysBloorstandardArg arg = new SysBloorstandardArg();
		SysBloorstandardCriteria criteria = arg.createCriteria();

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
