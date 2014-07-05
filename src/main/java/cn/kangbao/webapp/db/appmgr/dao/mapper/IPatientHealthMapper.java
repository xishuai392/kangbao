package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.PatientHealth;
import cn.kangbao.webapp.db.appmgr.arg.PatientHealthArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IPatientHealthMapper {
    List<Integer> countByArg(PatientHealthArg arg);

    int deleteByArg(PatientHealthArg arg);

	List<PatientHealth> selectByArg(PatientHealthArg arg);

	int updateByArgSelective(@Param("record") PatientHealth record, @Param("arg") PatientHealthArg arg);

	int updateByArg(@Param("record") PatientHealth record, @Param("arg") PatientHealthArg arg);

	List<PatientHealth> selectByArgAndPage(PatientHealthArg arg, RowBounds rowBound);

	int insert(PatientHealth record);

	int insertSelective(PatientHealth record);

	int insertBatch(@Param("list")List<PatientHealth> records);

	int deleteByPrimaryKey(Integer healthId);

	PatientHealth selectByPrimaryKey(Integer healthId);

	int updateByPrimaryKeySelective(PatientHealth record);

	int updateByPrimaryKey(PatientHealth record);
}