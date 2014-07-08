package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
public class HospitalDoctor implements Serializable {
       	private Integer hospitaldoctorid;

	public void setHospitaldoctorid(Integer hospitaldoctorid){
		this.hospitaldoctorid = hospitaldoctorid;
	}

	public Integer getHospitaldoctorid() {
		return hospitaldoctorid; 
	}

	private Integer hospitalid;

	public void setHospitalid(Integer hospitalid){
		this.hospitalid = hospitalid;
	}

	public Integer getHospitalid() {
		return hospitalid; 
	}

	private String doctorid;

	public void setDoctorid(String doctorid){
		this.doctorid = doctorid;
	}

	public String getDoctorid() {
		return StringUtils.isBlank(doctorid)?doctorid:doctorid.trim(); 
	}

	private Date createtime;

	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}

	public Date getCreatetime() {
		return createtime; 
	}

	private Integer dr;

	public void setDr(Integer dr){
		this.dr = dr;
	}

	public Integer getDr() {
		return dr; 
	}

}