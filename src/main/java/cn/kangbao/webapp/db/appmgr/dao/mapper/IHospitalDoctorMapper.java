package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.HospitalDoctor;
import cn.kangbao.webapp.db.appmgr.arg.HospitalDoctorArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IHospitalDoctorMapper {
    List<Integer> countByArg(HospitalDoctorArg arg);

    int deleteByArg(HospitalDoctorArg arg);

	List<HospitalDoctor> selectByArg(HospitalDoctorArg arg);

	int updateByArgSelective(@Param("record") HospitalDoctor record, @Param("arg") HospitalDoctorArg arg);

	int updateByArg(@Param("record") HospitalDoctor record, @Param("arg") HospitalDoctorArg arg);

	List<HospitalDoctor> selectByArgAndPage(HospitalDoctorArg arg, RowBounds rowBound);

	int insert(HospitalDoctor record);

	int insertSelective(HospitalDoctor record);

	int insertBatch(@Param("list")List<HospitalDoctor> records);

	int deleteByPrimaryKey(Integer hospitalDoctorId);

	HospitalDoctor selectByPrimaryKey(Integer hospitalDoctorId);

	int updateByPrimaryKeySelective(HospitalDoctor record);

	int updateByPrimaryKey(HospitalDoctor record);
}