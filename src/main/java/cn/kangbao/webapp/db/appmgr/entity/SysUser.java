package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
public class SysUser implements Serializable {
       	private Integer userid;

	public void setUserid(Integer userid){
		this.userid = userid;
	}

	public Integer getUserid() {
		return userid; 
	}

	private String username;

	public void setUsername(String username){
		this.username = username;
	}

	public String getUsername() {
		return StringUtils.isBlank(username)?username:username.trim(); 
	}

	private String password;

	public void setPassword(String password){
		this.password = password;
	}

	public String getPassword() {
		return StringUtils.isBlank(password)?password:password.trim(); 
	}

	private Boolean usertype;

	public void setUsertype(Boolean usertype){
		this.usertype = usertype;
	}

	public Boolean getUsertype() {
		return usertype; 
	}

	private Date createtime;

	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}

	public Date getCreatetime() {
		return createtime; 
	}

}