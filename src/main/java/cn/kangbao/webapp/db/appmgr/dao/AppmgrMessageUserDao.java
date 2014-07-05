package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.IMessageUserMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.MessageUser;
import cn.kangbao.webapp.db.appmgr.entity.MessageUserKey;

import cn.kangbao.webapp.db.appmgr.arg.MessageUserArg;
import cn.kangbao.webapp.db.appmgr.arg.MessageUserArg.MessageUserCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class AppmgrMessageUserDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(MessageUserArg arg){
		IMessageUserMapper mapper = mapperSupport.getMapper(IMessageUserMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(MessageUserArg arg){
		IMessageUserMapper mapper = mapperSupport.getMapper(IMessageUserMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<MessageUser> selectByArg(MessageUserArg arg){
		IMessageUserMapper mapper = mapperSupport.getMapper(IMessageUserMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(MessageUser record,MessageUserArg arg){
		IMessageUserMapper mapper = mapperSupport.getMapper(IMessageUserMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(MessageUser record,MessageUserArg arg){
		IMessageUserMapper mapper = mapperSupport.getMapper(IMessageUserMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<MessageUser> selectByArgAndPage(MessageUserArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		IMessageUserMapper mapper = mapperSupport.getMapper(IMessageUserMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(MessageUser record){
		IMessageUserMapper mapper = mapperSupport.getMapper(IMessageUserMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(MessageUser record){
		IMessageUserMapper mapper = mapperSupport.getMapper(IMessageUserMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<MessageUser> records){
		SqlSession session = mapperSupport.getSession();
		session.commit();
		try {
			IMessageUserMapper mapper = session.getMapper(IMessageUserMapper.class);
			return mapper.insertBatch(records);
		 } catch (Exception e) {
			session.rollback();
			throw new RuntimeException(e);
		}
		finally{
			session.close();
		}
	}

	public int deleteByPrimaryKey(MessageUserKey key){
		IMessageUserMapper mapper = mapperSupport.getMapper(IMessageUserMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public MessageUser selectByPrimaryKey(MessageUserKey key){
		IMessageUserMapper mapper = mapperSupport.getMapper(IMessageUserMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(MessageUser record){
		IMessageUserMapper mapper = mapperSupport.getMapper(IMessageUserMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(MessageUser record){
		IMessageUserMapper mapper = mapperSupport.getMapper(IMessageUserMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<MessageUser> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private MessageUserArg buildQueryObject(Map<String, String> params) {

		MessageUserArg arg = new MessageUserArg();
		MessageUserCriteria criteria = arg.createCriteria();

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
