package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
public class SysKeytable implements Serializable {
       	private String tablename;

	public void setTablename(String tablename){
		this.tablename = tablename;
	}

	public String getTablename() {
		return StringUtils.isBlank(tablename)?tablename:tablename.trim(); 
	}

	private Integer currentvalue;

	public void setCurrentvalue(Integer currentvalue){
		this.currentvalue = currentvalue;
	}

	public Integer getCurrentvalue() {
		return currentvalue; 
	}

	private Integer increment;

	public void setIncrement(Integer increment){
		this.increment = increment;
	}

	public Integer getIncrement() {
		return increment; 
	}

	private Date createtime;

	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}

	public Date getCreatetime() {
		return createtime; 
	}

}