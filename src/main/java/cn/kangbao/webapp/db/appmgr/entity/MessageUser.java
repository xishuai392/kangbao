package cn.kangbao.webapp.db.appmgr.entity;
import cn.kangbao.webapp.db.appmgr.entity.MessageUserKey;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
public class MessageUser  extends MessageUserKey implements Serializable {
       	private Date createtime;

	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}

	public Date getCreatetime() {
		return createtime; 
	}

}