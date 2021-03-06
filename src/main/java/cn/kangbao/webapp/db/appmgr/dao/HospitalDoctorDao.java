package cn.kangbao.webapp.db.appmgr.dao;

import java.util.*;
import org.apache.commons.lang.StringUtils;
import org.apache.ibatis.session.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import cn.kangbao.webapp.db.appmgr.dao.mapper.IHospitalDoctorMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import cn.kangbao.webapp.db.appmgr.entity.HospitalDoctor;

import cn.kangbao.webapp.db.appmgr.arg.HospitalDoctorArg;
import cn.kangbao.webapp.db.appmgr.arg.HospitalDoctorArg.HospitalDoctorCriteria;

import java.math.*;
import java.lang.reflect.Method;
@Repository

public class HospitalDoctorDao {

	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
	public List<Integer> countByArg(HospitalDoctorArg arg){
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.countByArg(arg);
	}

	public int deleteByArg(HospitalDoctorArg arg){
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.deleteByArg(arg);
	}

	public List<HospitalDoctor> selectByArg(HospitalDoctorArg arg){
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.selectByArg(arg);
	}

	public int updateByArgSelective(HospitalDoctor record,HospitalDoctorArg arg){
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.updateByArgSelective(record, arg);
	}

	public int updateByArg(HospitalDoctor record,HospitalDoctorArg arg){
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.updateByArg(record, arg);
	}

	public List<HospitalDoctor> selectByArgAndPage(HospitalDoctorArg arg, RowBounds rowBound){
		if(arg.getOrderByClause()==null)
		{
			if(arg.getPk_name()!=null)
			{
				arg.setOrderByClause(arg.getPk_name()+" desc");
			}
		}
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.selectByArgAndPage(arg, rowBound);
	}

	public int insert(HospitalDoctor record){
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.insert(record);
	}

	public int insertSelective(HospitalDoctor record){
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.insertSelective(record);
	}

	public int insertBatch(List<HospitalDoctor> records){
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.insertBatch(records);
	}

	public int deleteByPrimaryKey(Integer key){
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.deleteByPrimaryKey(key);
	}

	public HospitalDoctor selectByPrimaryKey(Integer key){
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.selectByPrimaryKey(key);
	}

	public int updateByPrimaryKeySelective(HospitalDoctor record){
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.updateByPrimaryKeySelective(record);
	}

	public int updateByPrimaryKey(HospitalDoctor record){
		IHospitalDoctorMapper mapper = mapperSupport.getMapper(IHospitalDoctorMapper.class);
		return mapper.updateByPrimaryKey(record);
	}
public List<HospitalDoctor> selectByMap(Map<String, String> params) {
		return(selectByArg(buildQueryObject(params)));
	}
	private HospitalDoctorArg buildQueryObject(Map<String, String> params) {

		HospitalDoctorArg arg = new HospitalDoctorArg();
		HospitalDoctorCriteria criteria = arg.createCriteria();

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
