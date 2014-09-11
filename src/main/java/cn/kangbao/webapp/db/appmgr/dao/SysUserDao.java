package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.ISysUserMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.SysUser;

import cn.kangbao.webapp.db.appmgr.arg.SysUserArg;
import cn.kangbao.webapp.db.appmgr.arg.SysUserArg.SysUserCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class SysUserDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(SysUserArg arg){
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(SysUserArg arg){
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<SysUser> selectByArg(SysUserArg arg){
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(SysUser record,SysUserArg arg){
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(SysUser record,SysUserArg arg){
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<SysUser> selectByArgAndPage(SysUserArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(SysUser record){
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(SysUser record){
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<SysUser> records){
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.insertBatch(records);
	}

	public int deleteByPrimaryKey(Integer key){
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public SysUser selectByPrimaryKey(Integer key){
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(SysUser record){
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(SysUser record){
		ISysUserMapper mapper = mapperSupport.getMapper(ISysUserMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<SysUser> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private SysUserArg buildQueryObject(Map<String, String> params) {

		SysUserArg arg = new SysUserArg();
		SysUserCriteria criteria = arg.createCriteria();

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
