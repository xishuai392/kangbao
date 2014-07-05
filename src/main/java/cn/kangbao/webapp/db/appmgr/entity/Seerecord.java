package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
public class Seerecord implements Serializable {
       	private Integer caseid;

	public void setCaseid(Integer caseid){
		this.caseid = caseid;
	}

	public Integer getCaseid() {
		return caseid; 
	}

	private Integer personid;

	public void setPersonid(Integer personid){
		this.personid = personid;
	}

	public Integer getPersonid() {
		return personid; 
	}

	private Integer doctorid;

	public void setDoctorid(Integer doctorid){
		this.doctorid = doctorid;
	}

	public Integer getDoctorid() {
		return doctorid; 
	}

	private Date readtime;

	public void setReadtime(Date readtime){
		this.readtime = readtime;
	}

	public Date getReadtime() {
		return readtime; 
	}

	private String reply;

	public void setReply(String reply){
		this.reply = reply;
	}

	public String getReply() {
		return StringUtils.isBlank(reply)?reply:reply.trim(); 
	}

	private Date replytime;

	public void setReplytime(Date replytime){
		this.replytime = replytime;
	}

	public Date getReplytime() {
		return replytime; 
	}

	private Date createtime;

	public void setCreatetime(Date createtime){
		this.createtime = createtime;
	}

	public Date getCreatetime() {
		return createtime; 
	}

}