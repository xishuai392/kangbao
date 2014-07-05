package cn.kangbao.webapp.db.appmgr.dao.mapper;

import cn.kangbao.webapp.db.appmgr.entity.Hospital;
import cn.kangbao.webapp.db.appmgr.arg.HospitalArg;
import java.util.*;
import java.math.*;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.session.RowBounds;

public interface IHospitalMapper {
    List<Integer> countByArg(HospitalArg arg);

    int deleteByArg(HospitalArg arg);

	List<Hospital> selectByArg(HospitalArg arg);

	int updateByArgSelective(@Param("record") Hospital record, @Param("arg") HospitalArg arg);

	int updateByArg(@Param("record") Hospital record, @Param("arg") HospitalArg arg);

	List<Hospital> selectByArgAndPage(HospitalArg arg, RowBounds rowBound);

	int insert(Hospital record);

	int insertSelective(Hospital record);

	int insertBatch(@Param("list")List<Hospital> records);

	int deleteByPrimaryKey(Integer hospitalId);

	Hospital selectByPrimaryKey(Integer hospitalId);

	int updateByPrimaryKeySelective(Hospital record);

	int updateByPrimaryKey(Hospital record);
}