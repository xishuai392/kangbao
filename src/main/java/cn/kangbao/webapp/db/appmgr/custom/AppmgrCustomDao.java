package cn.kangbao.webapp.db.appmgr.custom;

import java.util.List;

import cn.kangbao.webapp.db.appmgr.custom.mapper.ICustomMapper;
import cn.kangbao.webapp.db.appmgr.AppmgrSessionAndMapperSupport;
import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class AppmgrCustomDao {
	@Autowired
	private AppmgrSessionAndMapperSupport mapperSupport;
}
