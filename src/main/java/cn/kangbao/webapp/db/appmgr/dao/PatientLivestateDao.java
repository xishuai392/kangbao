package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.IPatientLivestateMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.PatientLivestate;

import cn.kangbao.webapp.db.appmgr.arg.PatientLivestateArg;
import cn.kangbao.webapp.db.appmgr.arg.PatientLivestateArg.PatientLivestateCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class PatientLivestateDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(PatientLivestateArg arg){
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(PatientLivestateArg arg){
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<PatientLivestate> selectByArg(PatientLivestateArg arg){
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(PatientLivestate record,PatientLivestateArg arg){
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(PatientLivestate record,PatientLivestateArg arg){
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<PatientLivestate> selectByArgAndPage(PatientLivestateArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(PatientLivestate record){
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(PatientLivestate record){
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<PatientLivestate> records){
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.insertBatch(records);
	}

	public int deleteByPrimaryKey(Integer key){
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public PatientLivestate selectByPrimaryKey(Integer key){
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(PatientLivestate record){
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(PatientLivestate record){
		IPatientLivestateMapper mapper = mapperSupport.getMapper(IPatientLivestateMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<PatientLivestate> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private PatientLivestateArg buildQueryObject(Map<String, String> params) {

		PatientLivestateArg arg = new PatientLivestateArg();
		PatientLivestateCriteria criteria = arg.createCriteria();

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
