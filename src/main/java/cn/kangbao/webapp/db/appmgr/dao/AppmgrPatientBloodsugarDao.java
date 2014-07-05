package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.IPatientBloodsugarMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.PatientBloodsugar;

import cn.kangbao.webapp.db.appmgr.arg.PatientBloodsugarArg;
import cn.kangbao.webapp.db.appmgr.arg.PatientBloodsugarArg.PatientBloodsugarCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class AppmgrPatientBloodsugarDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(PatientBloodsugarArg arg){
		IPatientBloodsugarMapper mapper = mapperSupport.getMapper(IPatientBloodsugarMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(PatientBloodsugarArg arg){
		IPatientBloodsugarMapper mapper = mapperSupport.getMapper(IPatientBloodsugarMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<PatientBloodsugar> selectByArg(PatientBloodsugarArg arg){
		IPatientBloodsugarMapper mapper = mapperSupport.getMapper(IPatientBloodsugarMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(PatientBloodsugar record,PatientBloodsugarArg arg){
		IPatientBloodsugarMapper mapper = mapperSupport.getMapper(IPatientBloodsugarMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(PatientBloodsugar record,PatientBloodsugarArg arg){
		IPatientBloodsugarMapper mapper = mapperSupport.getMapper(IPatientBloodsugarMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<PatientBloodsugar> selectByArgAndPage(PatientBloodsugarArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		IPatientBloodsugarMapper mapper = mapperSupport.getMapper(IPatientBloodsugarMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(PatientBloodsugar record){
		IPatientBloodsugarMapper mapper = mapperSupport.getMapper(IPatientBloodsugarMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(PatientBloodsugar record){
		IPatientBloodsugarMapper mapper = mapperSupport.getMapper(IPatientBloodsugarMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<PatientBloodsugar> records){
		SqlSession session = mapperSupport.getSession();
		session.commit();
		try {
			IPatientBloodsugarMapper mapper = session.getMapper(IPatientBloodsugarMapper.class);
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
		IPatientBloodsugarMapper mapper = mapperSupport.getMapper(IPatientBloodsugarMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public PatientBloodsugar selectByPrimaryKey(Integer key){
		IPatientBloodsugarMapper mapper = mapperSupport.getMapper(IPatientBloodsugarMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(PatientBloodsugar record){
		IPatientBloodsugarMapper mapper = mapperSupport.getMapper(IPatientBloodsugarMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(PatientBloodsugar record){
		IPatientBloodsugarMapper mapper = mapperSupport.getMapper(IPatientBloodsugarMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<PatientBloodsugar> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private PatientBloodsugarArg buildQueryObject(Map<String, String> params) {

		PatientBloodsugarArg arg = new PatientBloodsugarArg();
		PatientBloodsugarCriteria criteria = arg.createCriteria();

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
