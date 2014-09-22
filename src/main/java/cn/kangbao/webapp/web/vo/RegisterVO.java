/**
 * 
 */
package cn.kangbao.webapp.web.vo;

import java.util.Date;

import org.apache.commons.lang.StringUtils;

import cn.kangbao.common.dto.AbstractDto;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年9月22日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.vo <br>
 */

public class RegisterVO extends AbstractDto {
    private Integer userid;

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getUserid() {
        return userid;
    }

    private String username;

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUsername() {
        return StringUtils.isBlank(username) ? username : username.trim();
    }

    private String password;

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return StringUtils.isBlank(password) ? password : password.trim();
    }

    private String repassword;

    /**
     * @return the repassword
     */
    public String getRepassword() {
        return repassword;
    }

    /**
     * @param repassword the repassword to set
     */
    public void setRepassword(String repassword) {
        this.repassword = repassword;
    }

    private String usertype;

    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    public String getUsertype() {
        return StringUtils.isBlank(usertype) ? usertype : usertype.trim();
    }

    private Date createtime;

    public void setCreatetime(Date createtime) {
        this.createtime = createtime;
    }

    public Date getCreatetime() {
        return createtime;
    }

    private Integer dr;

    public void setDr(Integer dr) {
        this.dr = dr;
    }

    public Integer getDr() {
        return dr;
    }

    private String email;

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmail() {
        return StringUtils.isBlank(email) ? email : email.trim();
    }

    private Date registertime;

    public void setRegistertime(Date registertime) {
        this.registertime = registertime;
    }

    public Date getRegistertime() {
        return registertime;
    }

    private String state;

    public void setState(String state) {
        this.state = state;
    }

    public String getState() {
        return StringUtils.isBlank(state) ? state : state.trim();
    }
}
