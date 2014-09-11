package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
import cn.kangbao.common.dto.AbstractDto;
public class PatientLivestate  extends AbstractDto  implements Serializable {
       	private Integer livestateid;

	public void setLivestateid(Integer livestateid){
		this.livestateid = livestateid;
	}

	public Integer getLivestateid() {
		return livestateid; 
	}

	private Integer personid;

	public void setPersonid(Integer personid){
		this.personid = personid;
	}

	public Integer getPersonid() {
		return personid; 
	}

	private Integer liveitem;

	public void setLiveitem(Integer liveitem){
		this.liveitem = liveitem;
	}

	public Integer getLiveitem() {
		return liveitem; 
	}

	private String livestate;

	public void setLivestate(String livestate){
		this.livestate = livestate;
	}

	public String getLivestate() {
		return StringUtils.isBlank(livestate)?livestate:livestate.trim(); 
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