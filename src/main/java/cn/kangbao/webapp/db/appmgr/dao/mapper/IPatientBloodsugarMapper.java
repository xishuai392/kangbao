package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.PatientBloodsugar;
import cn.kangbao.webapp.db.appmgr.arg.PatientBloodsugarArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IPatientBloodsugarMapper {
    List<Integer> countByArg(PatientBloodsugarArg arg);

    int deleteByArg(PatientBloodsugarArg arg);

	List<PatientBloodsugar> selectByArg(PatientBloodsugarArg arg);

	int updateByArgSelective(@Param("record") PatientBloodsugar record, @Param("arg") PatientBloodsugarArg arg);

	int updateByArg(@Param("record") PatientBloodsugar record, @Param("arg") PatientBloodsugarArg arg);

	List<PatientBloodsugar> selectByArgAndPage(PatientBloodsugarArg arg, RowBounds rowBound);

	int insert(PatientBloodsugar record);

	int insertSelective(PatientBloodsugar record);

	int insertBatch(@Param("list")List<PatientBloodsugar> records);

	int deleteByPrimaryKey(Integer bloodSugarId);

	PatientBloodsugar selectByPrimaryKey(Integer bloodSugarId);

	int updateByPrimaryKeySelective(PatientBloodsugar record);

	int updateByPrimaryKey(PatientBloodsugar record);
}