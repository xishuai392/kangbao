package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.PatientLivestate;
import cn.kangbao.webapp.db.appmgr.arg.PatientLivestateArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IPatientLivestateMapper {
    List<Integer> countByArg(PatientLivestateArg arg);

    int deleteByArg(PatientLivestateArg arg);

	List<PatientLivestate> selectByArg(PatientLivestateArg arg);

	int updateByArgSelective(@Param("record") PatientLivestate record, @Param("arg") PatientLivestateArg arg);

	int updateByArg(@Param("record") PatientLivestate record, @Param("arg") PatientLivestateArg arg);

	List<PatientLivestate> selectByArgAndPage(PatientLivestateArg arg, RowBounds rowBound);

	int insert(PatientLivestate record);

	int insertSelective(PatientLivestate record);

	int insertBatch(@Param("list")List<PatientLivestate> records);

	int deleteByPrimaryKey(Integer liveStateId);

	PatientLivestate selectByPrimaryKey(Integer liveStateId);

	int updateByPrimaryKeySelective(PatientLivestate record);

	int updateByPrimaryKey(PatientLivestate record);
}