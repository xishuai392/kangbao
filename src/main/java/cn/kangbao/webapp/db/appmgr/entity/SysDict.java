package cn.kangbao.webapp.db.appmgr.entity;
import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;
import cn.kangbao.common.dto.AbstractDto;
public class SysDict  extends AbstractDto  implements Serializable {
       	private Long dictid;

	public void setDictid(Long dictid){
		this.dictid = dictid;
	}

	public Long getDictid() {
		return dictid; 
	}

	private String dictname;

	public void setDictname(String dictname){
		this.dictname = dictname;
	}

	public String getDictname() {
		return StringUtils.isBlank(dictname)?dictname:dictname.trim(); 
	}

	private Integer updictid;

	public void setUpdictid(Integer updictid){
		this.updictid = updictid;
	}

	public Integer getUpdictid() {
		return updictid; 
	}

	private String constant;

	public void setConstant(String constant){
		this.constant = constant;
	}

	public String getConstant() {
		return StringUtils.isBlank(constant)?constant:constant.trim(); 
	}

}