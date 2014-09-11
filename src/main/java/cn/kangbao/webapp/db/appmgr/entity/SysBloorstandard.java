package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
import cn.kangbao.common.dto.AbstractDto;
public class SysBloorstandard  extends AbstractDto  implements Serializable {
       	private Integer bloorstdid;

	public void setBloorstdid(Integer bloorstdid){
		this.bloorstdid = bloorstdid;
	}

	public Integer getBloorstdid() {
		return bloorstdid; 
	}

	private String standardname;

	public void setStandardname(String standardname){
		this.standardname = standardname;
	}

	public String getStandardname() {
		return StringUtils.isBlank(standardname)?standardname:standardname.trim(); 
	}

	private Integer contractmaxnum;

	public void setContractmaxnum(Integer contractmaxnum){
		this.contractmaxnum = contractmaxnum;
	}

	public Integer getContractmaxnum() {
		return contractmaxnum; 
	}

	private Integer contractminnum;

	public void setContractminnum(Integer contractminnum){
		this.contractminnum = contractminnum;
	}

	public Integer getContractminnum() {
		return contractminnum; 
	}

	private Integer diastolicmaxnum;

	public void setDiastolicmaxnum(Integer diastolicmaxnum){
		this.diastolicmaxnum = diastolicmaxnum;
	}

	public Integer getDiastolicmaxnum() {
		return diastolicmaxnum; 
	}

	private Integer diastolicminnum;

	public void setDiastolicminnum(Integer diastolicminnum){
		this.diastolicminnum = diastolicminnum;
	}

	public Integer getDiastolicminnum() {
		return diastolicminnum; 
	}

	private Date createtime;

	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}

	public Date getCreatetime() {
		return createtime; 
	}

}