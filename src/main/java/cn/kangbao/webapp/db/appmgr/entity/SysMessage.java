package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
import cn.kangbao.common.dto.AbstractDto;
public class SysMessage  extends AbstractDto  implements Serializable {
       	private Integer messageid;

	public void setMessageid(Integer messageid){
		this.messageid = messageid;
	}

	public Integer getMessageid() {
		return messageid; 
	}

	private Integer userid;

	public void setUserid(Integer userid){
		this.userid = userid;
	}

	public Integer getUserid() {
		return userid; 
	}

	private String title;

	public void setTitle(String title){
		this.title = title;
	}

	public String getTitle() {
		return StringUtils.isBlank(title)?title:title.trim(); 
	}

	private String content;

	public void setContent(String content){
		this.content = content;
	}

	public String getContent() {
		return StringUtils.isBlank(content)?content:content.trim(); 
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