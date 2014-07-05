package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.IHospitalMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.Hospital;

import cn.kangbao.webapp.db.appmgr.arg.HospitalArg;
import cn.kangbao.webapp.db.appmgr.arg.HospitalArg.HospitalCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class AppmgrHospitalDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(HospitalArg arg){
		IHospitalMapper mapper = mapperSupport.getMapper(IHospitalMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(HospitalArg arg){
		IHospitalMapper mapper = mapperSupport.getMapper(IHospitalMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<Hospital> selectByArg(HospitalArg arg){
		IHospitalMapper mapper = mapperSupport.getMapper(IHospitalMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(Hospital record,HospitalArg arg){
		IHospitalMapper mapper = mapperSupport.getMapper(IHospitalMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(Hospital record,HospitalArg arg){
		IHospitalMapper mapper = mapperSupport.getMapper(IHospitalMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<Hospital> selectByArgAndPage(HospitalArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		IHospitalMapper mapper = mapperSupport.getMapper(IHospitalMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(Hospital record){
		IHospitalMapper mapper = mapperSupport.getMapper(IHospitalMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(Hospital record){
		IHospitalMapper mapper = mapperSupport.getMapper(IHospitalMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<Hospital> records){
		SqlSession session = mapperSupport.getSession();
		session.commit();
		try {
			IHospitalMapper mapper = session.getMapper(IHospitalMapper.class);
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
		IHospitalMapper mapper = mapperSupport.getMapper(IHospitalMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public Hospital selectByPrimaryKey(Integer key){
		IHospitalMapper mapper = mapperSupport.getMapper(IHospitalMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(Hospital record){
		IHospitalMapper mapper = mapperSupport.getMapper(IHospitalMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(Hospital record){
		IHospitalMapper mapper = mapperSupport.getMapper(IHospitalMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<Hospital> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private HospitalArg buildQueryObject(Map<String, String> params) {

		HospitalArg arg = new HospitalArg();
		HospitalCriteria criteria = arg.createCriteria();

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
