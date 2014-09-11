package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
import cn.kangbao.common.dto.AbstractDto;
public class PatientHealth  extends AbstractDto  implements Serializable {
       	private Integer healthid;

	public void setHealthid(Integer healthid){
		this.healthid = healthid;
	}

	public Integer getHealthid() {
		return healthid; 
	}

	private Integer personid;

	public void setPersonid(Integer personid){
		this.personid = personid;
	}

	public Integer getPersonid() {
		return personid; 
	}

	private BigDecimal weight;

	public void setWeight(BigDecimal weight){
		this.weight = weight;
	}

	public BigDecimal getWeight() {
		return weight; 
	}

	private BigDecimal height;

	public void setHeight(BigDecimal height){
		this.height = height;
	}

	public BigDecimal getHeight() {
		return height; 
	}

	private String isfamilydiabetes;

	public void setIsfamilydiabetes(String isfamilydiabetes){
		this.isfamilydiabetes = isfamilydiabetes;
	}

	public String getIsfamilydiabetes() {
		return StringUtils.isBlank(isfamilydiabetes)?isfamilydiabetes:isfamilydiabetes.trim(); 
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