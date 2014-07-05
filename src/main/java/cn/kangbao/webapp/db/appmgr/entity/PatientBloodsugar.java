package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
public class PatientBloodsugar implements Serializable {
       	private Integer bloodsugarid;

	public void setBloodsugarid(Integer bloodsugarid){
		this.bloodsugarid = bloodsugarid;
	}

	public Integer getBloodsugarid() {
		return bloodsugarid; 
	}

	private Integer bloodsugarnum;

	public void setBloodsugarnum(Integer bloodsugarnum){
		this.bloodsugarnum = bloodsugarnum;
	}

	public Integer getBloodsugarnum() {
		return bloodsugarnum; 
	}

	private Integer influence;

	public void setInfluence(Integer influence){
		this.influence = influence;
	}

	public Integer getInfluence() {
		return influence; 
	}

	private Date createtime;

	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}

	public Date getCreatetime() {
		return createtime; 
	}

	private Integer personid;

	public void setPersonid(Integer personid){
		this.personid = personid;
	}

	public Integer getPersonid() {
		return personid; 
	}

}