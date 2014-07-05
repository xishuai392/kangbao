package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.ISysCityMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.SysCity;

import cn.kangbao.webapp.db.appmgr.arg.SysCityArg;
import cn.kangbao.webapp.db.appmgr.arg.SysCityArg.SysCityCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class AppmgrSysCityDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(SysCityArg arg){
		ISysCityMapper mapper = mapperSupport.getMapper(ISysCityMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(SysCityArg arg){
		ISysCityMapper mapper = mapperSupport.getMapper(ISysCityMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<SysCity> selectByArg(SysCityArg arg){
		ISysCityMapper mapper = mapperSupport.getMapper(ISysCityMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(SysCity record,SysCityArg arg){
		ISysCityMapper mapper = mapperSupport.getMapper(ISysCityMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(SysCity record,SysCityArg arg){
		ISysCityMapper mapper = mapperSupport.getMapper(ISysCityMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<SysCity> selectByArgAndPage(SysCityArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		ISysCityMapper mapper = mapperSupport.getMapper(ISysCityMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(SysCity record){
		ISysCityMapper mapper = mapperSupport.getMapper(ISysCityMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(SysCity record){
		ISysCityMapper mapper = mapperSupport.getMapper(ISysCityMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<SysCity> records){
		SqlSession session = mapperSupport.getSession();
		session.commit();
		try {
			ISysCityMapper mapper = session.getMapper(ISysCityMapper.class);
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
		ISysCityMapper mapper = mapperSupport.getMapper(ISysCityMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public SysCity selectByPrimaryKey(Integer key){
		ISysCityMapper mapper = mapperSupport.getMapper(ISysCityMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(SysCity record){
		ISysCityMapper mapper = mapperSupport.getMapper(ISysCityMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(SysCity record){
		ISysCityMapper mapper = mapperSupport.getMapper(ISysCityMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<SysCity> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private SysCityArg buildQueryObject(Map<String, String> params) {

		SysCityArg arg = new SysCityArg();
		SysCityCriteria criteria = arg.createCriteria();

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
