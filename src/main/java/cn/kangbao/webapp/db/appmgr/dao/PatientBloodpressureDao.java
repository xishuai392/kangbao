package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.IPatientBloodpressureMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.PatientBloodpressure;

import cn.kangbao.webapp.db.appmgr.arg.PatientBloodpressureArg;
import cn.kangbao.webapp.db.appmgr.arg.PatientBloodpressureArg.PatientBloodpressureCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class PatientBloodpressureDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(PatientBloodpressureArg arg){
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(PatientBloodpressureArg arg){
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<PatientBloodpressure> selectByArg(PatientBloodpressureArg arg){
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(PatientBloodpressure record,PatientBloodpressureArg arg){
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(PatientBloodpressure record,PatientBloodpressureArg arg){
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<PatientBloodpressure> selectByArgAndPage(PatientBloodpressureArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(PatientBloodpressure record){
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(PatientBloodpressure record){
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<PatientBloodpressure> records){
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.insertBatch(records);
	}

	public int deleteByPrimaryKey(Integer key){
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public PatientBloodpressure selectByPrimaryKey(Integer key){
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(PatientBloodpressure record){
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(PatientBloodpressure record){
		IPatientBloodpressureMapper mapper = mapperSupport.getMapper(IPatientBloodpressureMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<PatientBloodpressure> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private PatientBloodpressureArg buildQueryObject(Map<String, String> params) {

		PatientBloodpressureArg arg = new PatientBloodpressureArg();
		PatientBloodpressureCriteria criteria = arg.createCriteria();

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
