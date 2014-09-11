package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
import cn.kangbao.common.dto.AbstractDto;
public class Hospital  extends AbstractDto  implements Serializable {
       	private Integer hospitalid;

	public void setHospitalid(Integer hospitalid){
		this.hospitalid = hospitalid;
	}

	public Integer getHospitalid() {
		return hospitalid; 
	}

	private String hospitalname;

	public void setHospitalname(String hospitalname){
		this.hospitalname = hospitalname;
	}

	public String getHospitalname() {
		return StringUtils.isBlank(hospitalname)?hospitalname:hospitalname.trim(); 
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