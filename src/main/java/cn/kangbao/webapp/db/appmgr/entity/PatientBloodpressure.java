package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
public class PatientBloodpressure implements Serializable {
       	private Integer measurementid;

	public void setMeasurementid(Integer measurementid){
		this.measurementid = measurementid;
	}

	public Integer getMeasurementid() {
		return measurementid; 
	}

	private Integer personid;

	public void setPersonid(Integer personid){
		this.personid = personid;
	}

	public Integer getPersonid() {
		return personid; 
	}

	private Integer upnum;

	public void setUpnum(Integer upnum){
		this.upnum = upnum;
	}

	public Integer getUpnum() {
		return upnum; 
	}

	private Integer downnum;

	public void setDownnum(Integer downnum){
		this.downnum = downnum;
	}

	public Integer getDownnum() {
		return downnum; 
	}

	private Integer heartrate;

	public void setHeartrate(Integer heartrate){
		this.heartrate = heartrate;
	}

	public Integer getHeartrate() {
		return heartrate; 
	}

	private String feelingdescription;

	public void setFeelingdescription(String feelingdescription){
		this.feelingdescription = feelingdescription;
	}

	public String getFeelingdescription() {
		return StringUtils.isBlank(feelingdescription)?feelingdescription:feelingdescription.trim(); 
	}

	private Date createtime;

	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}

	public Date getCreatetime() {
		return createtime; 
	}

}