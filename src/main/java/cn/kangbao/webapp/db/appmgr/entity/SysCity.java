package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
import cn.kangbao.common.dto.AbstractDto;
public class SysCity  extends AbstractDto  implements Serializable {
       	private Integer cityid;

	public void setCityid(Integer cityid){
		this.cityid = cityid;
	}

	public Integer getCityid() {
		return cityid; 
	}

	private String cityname;

	public void setCityname(String cityname){
		this.cityname = cityname;
	}

	public String getCityname() {
		return StringUtils.isBlank(cityname)?cityname:cityname.trim(); 
	}

	private Integer upcityid;

	public void setUpcityid(Integer upcityid){
		this.upcityid = upcityid;
	}

	public Integer getUpcityid() {
		return upcityid; 
	}

	private Date createtime;

	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}

	public Date getCreatetime() {
		return createtime; 
	}

}