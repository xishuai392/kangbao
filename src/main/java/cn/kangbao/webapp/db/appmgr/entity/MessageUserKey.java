package cn.kangbao.webapp.db.appmgr.entity;

import java.io.Serializable;
import java.math.*;
import java.util.*;
import org.apache.commons.lang.StringUtils;

public class MessageUserKey implements Serializable {
    private Integer messageid;

    public void setMessageid(Integer messageid) {
        this.messageid = messageid;
    }

    public Integer getMessageid() {
        return messageid;
    }

    private Integer userid;

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getUserid() {
        return userid;
    }

}