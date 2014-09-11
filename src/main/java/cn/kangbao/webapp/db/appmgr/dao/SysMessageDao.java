package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.ISysMessageMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.SysMessage;

import cn.kangbao.webapp.db.appmgr.arg.SysMessageArg;
import cn.kangbao.webapp.db.appmgr.arg.SysMessageArg.SysMessageCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class SysMessageDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(SysMessageArg arg){
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(SysMessageArg arg){
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<SysMessage> selectByArg(SysMessageArg arg){
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(SysMessage record,SysMessageArg arg){
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(SysMessage record,SysMessageArg arg){
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<SysMessage> selectByArgAndPage(SysMessageArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(SysMessage record){
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(SysMessage record){
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<SysMessage> records){
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.insertBatch(records);
	}

	public int deleteByPrimaryKey(Integer key){
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public SysMessage selectByPrimaryKey(Integer key){
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(SysMessage record){
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(SysMessage record){
		ISysMessageMapper mapper = mapperSupport.getMapper(ISysMessageMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<SysMessage> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private SysMessageArg buildQueryObject(Map<String, String> params) {

		SysMessageArg arg = new SysMessageArg();
		SysMessageCriteria criteria = arg.createCriteria();

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
