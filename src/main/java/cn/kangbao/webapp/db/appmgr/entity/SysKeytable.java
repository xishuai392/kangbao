package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
public class SysKeytable implements Serializable {
       	private Integer tableid;

	public void setTableid(Integer tableid){
		this.tableid = tableid;
	}

	public Integer getTableid() {
		return tableid; 
	}

	private String talbename;

	public void setTalbename(String talbename){
		this.talbename = talbename;
	}

	public String getTalbename() {
		return StringUtils.isBlank(talbename)?talbename:talbename.trim(); 
	}

	private Integer nextid;

	public void setNextid(Integer nextid){
		this.nextid = nextid;
	}

	public Integer getNextid() {
		return nextid; 
	}

	private Date createtime;

	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}

	public Date getCreatetime() {
		return createtime; 
	}

}