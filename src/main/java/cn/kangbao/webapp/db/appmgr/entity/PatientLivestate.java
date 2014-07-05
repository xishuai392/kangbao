package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
public class PatientLivestate implements Serializable {
       	private Integer livestateid;

	public void setLivestateid(Integer livestateid){
		this.livestateid = livestateid;
	}

	public Integer getLivestateid() {
		return livestateid; 
	}

	private Integer personid;

	public void setPersonid(Integer personid){
		this.personid = personid;
	}

	public Integer getPersonid() {
		return personid; 
	}

	private Integer liveitem;

	public void setLiveitem(Integer liveitem){
		this.liveitem = liveitem;
	}

	public Integer getLiveitem() {
		return liveitem; 
	}

	private Boolean livestate;

	public void setLivestate(Boolean livestate){
		this.livestate = livestate;
	}

	public Boolean getLivestate() {
		return livestate; 
	}

	private Date createtime;

	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}

	public Date getCreatetime() {
		return createtime; 
	}

}