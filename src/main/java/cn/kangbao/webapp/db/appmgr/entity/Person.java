package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
import cn.kangbao.common.dto.AbstractDto;
public class Person  extends AbstractDto  implements Serializable {
       	private Integer personid;

	public void setPersonid(Integer personid){
		this.personid = personid;
	}

	public Integer getPersonid() {
		return personid; 
	}

	private Integer userid;

	public void setUserid(Integer userid){
		this.userid = userid;
	}

	public Integer getUserid() {
		return userid; 
	}

	private Integer mainpersonid;

	public void setMainpersonid(Integer mainpersonid){
		this.mainpersonid = mainpersonid;
	}

	public Integer getMainpersonid() {
		return mainpersonid; 
	}

	private String usertype;

	public void setUsertype(String usertype){
		this.usertype = usertype;
	}

	public String getUsertype() {
		return StringUtils.isBlank(usertype)?usertype:usertype.trim(); 
	}

	private String fullname;

	public void setFullname(String fullname){
		this.fullname = fullname;
	}

	public String getFullname() {
		return StringUtils.isBlank(fullname)?fullname:fullname.trim(); 
	}

	private Integer sextype;

	public void setSextype(Integer sextype){
		this.sextype = sextype;
	}

	public Integer getSextype() {
		return sextype; 
	}

	private Date birthday;

	public void setBirthday(Date birthday){
		this.birthday = birthday;
	}

	public Date getBirthday() {
		return birthday; 
	}

	private String mobile;

	public void setMobile(String mobile){
		this.mobile = mobile;
	}

	public String getMobile() {
		return StringUtils.isBlank(mobile)?mobile:mobile.trim(); 
	}

	private Integer cityid;

	public void setCityid(Integer cityid){
		this.cityid = cityid;
	}

	public Integer getCityid() {
		return cityid; 
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