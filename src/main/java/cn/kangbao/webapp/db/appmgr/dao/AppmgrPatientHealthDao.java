package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.IPatientHealthMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.PatientHealth;

import cn.kangbao.webapp.db.appmgr.arg.PatientHealthArg;
import cn.kangbao.webapp.db.appmgr.arg.PatientHealthArg.PatientHealthCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class AppmgrPatientHealthDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(PatientHealthArg arg){
		IPatientHealthMapper mapper = mapperSupport.getMapper(IPatientHealthMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(PatientHealthArg arg){
		IPatientHealthMapper mapper = mapperSupport.getMapper(IPatientHealthMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<PatientHealth> selectByArg(PatientHealthArg arg){
		IPatientHealthMapper mapper = mapperSupport.getMapper(IPatientHealthMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(PatientHealth record,PatientHealthArg arg){
		IPatientHealthMapper mapper = mapperSupport.getMapper(IPatientHealthMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(PatientHealth record,PatientHealthArg arg){
		IPatientHealthMapper mapper = mapperSupport.getMapper(IPatientHealthMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<PatientHealth> selectByArgAndPage(PatientHealthArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		IPatientHealthMapper mapper = mapperSupport.getMapper(IPatientHealthMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(PatientHealth record){
		IPatientHealthMapper mapper = mapperSupport.getMapper(IPatientHealthMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(PatientHealth record){
		IPatientHealthMapper mapper = mapperSupport.getMapper(IPatientHealthMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<PatientHealth> records){
		SqlSession session = mapperSupport.getSession();
		session.commit();
		try {
			IPatientHealthMapper mapper = session.getMapper(IPatientHealthMapper.class);
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
		IPatientHealthMapper mapper = mapperSupport.getMapper(IPatientHealthMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public PatientHealth selectByPrimaryKey(Integer key){
		IPatientHealthMapper mapper = mapperSupport.getMapper(IPatientHealthMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(PatientHealth record){
		IPatientHealthMapper mapper = mapperSupport.getMapper(IPatientHealthMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(PatientHealth record){
		IPatientHealthMapper mapper = mapperSupport.getMapper(IPatientHealthMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<PatientHealth> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private PatientHealthArg buildQueryObject(Map<String, String> params) {

		PatientHealthArg arg = new PatientHealthArg();
		PatientHealthCriteria criteria = arg.createCriteria();

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
