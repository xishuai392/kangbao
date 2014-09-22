package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
import cn.kangbao.common.dto.AbstractDto;
public class SysUser  extends AbstractDto  implements Serializable {
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

	private String usertype;

	public void setUsertype(String usertype){
		this.usertype = usertype;
	}

	public String getUsertype() {
		return StringUtils.isBlank(usertype)?usertype:usertype.trim(); 
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

	private String email;

	public void setEmail(String email){
		this.email = email;
	}

	public String getEmail() {
		return StringUtils.isBlank(email)?email:email.trim(); 
	}

	private Date registertime;

	public void setRegistertime(Date registertime){
		this.registertime = registertime;
	}

	public Date getRegistertime() {
		return registertime; 
	}

	private String state;

	public void setState(String state){
		this.state = state;
	}

	public String getState() {
		return StringUtils.isBlank(state)?state:state.trim(); 
	}

}