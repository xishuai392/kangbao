package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.PatientBloodpressure;
import cn.kangbao.webapp.db.appmgr.arg.PatientBloodpressureArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IPatientBloodpressureMapper {
    List<Integer> countByArg(PatientBloodpressureArg arg);

    int deleteByArg(PatientBloodpressureArg arg);

	List<PatientBloodpressure> selectByArg(PatientBloodpressureArg arg);

	int updateByArgSelective(@Param("record") PatientBloodpressure record, @Param("arg") PatientBloodpressureArg arg);

	int updateByArg(@Param("record") PatientBloodpressure record, @Param("arg") PatientBloodpressureArg arg);

	List<PatientBloodpressure> selectByArgAndPage(PatientBloodpressureArg arg, RowBounds rowBound);

	int insert(PatientBloodpressure record);

	int insertSelective(PatientBloodpressure record);

	int insertBatch(@Param("list")List<PatientBloodpressure> records);

	int deleteByPrimaryKey(Integer measurementId);

	PatientBloodpressure selectByPrimaryKey(Integer measurementId);

	int updateByPrimaryKeySelective(PatientBloodpressure record);

	int updateByPrimaryKey(PatientBloodpressure record);
}