package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.ISeerecordMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.Seerecord;

import cn.kangbao.webapp.db.appmgr.arg.SeerecordArg;
import cn.kangbao.webapp.db.appmgr.arg.SeerecordArg.SeerecordCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class SeerecordDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(SeerecordArg arg){
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(SeerecordArg arg){
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<Seerecord> selectByArg(SeerecordArg arg){
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(Seerecord record,SeerecordArg arg){
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(Seerecord record,SeerecordArg arg){
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<Seerecord> selectByArgAndPage(SeerecordArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(Seerecord record){
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(Seerecord record){
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<Seerecord> records){
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.insertBatch(records);
	}

	public int deleteByPrimaryKey(Integer key){
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public Seerecord selectByPrimaryKey(Integer key){
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(Seerecord record){
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Seerecord record){
		ISeerecordMapper mapper = mapperSupport.getMapper(ISeerecordMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<Seerecord> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private SeerecordArg buildQueryObject(Map<String, String> params) {

		SeerecordArg arg = new SeerecordArg();
		SeerecordCriteria criteria = arg.createCriteria();

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
