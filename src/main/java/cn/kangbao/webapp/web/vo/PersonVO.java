/**
 * 
 */
package cn.kangbao.webapp.web.vo;

import java.math.BigDecimal;
import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

import cn.kangbao.common.dto.AbstractDto;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年8月14日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.vo <br>
 */

public class PersonVO extends AbstractDto {

    private Integer personid;

    private Integer userid;

    private Integer mainpersonid;

    private String usertype;

    private String fullname;

    private Integer sextype;

    @DateTimeFormat(pattern = "yyyy-MM-dd")
    private Date birthday;

    private String mobile;

    private Integer cityid;

    private Integer healthid;

    private BigDecimal weight;

    private BigDecimal height;

    private String isfamilydiabetes;

    private String livestate_xiyan;

    private String livestate_yinshi;

    private String livestate_hejiu;

    private String livestate_shuimian;

    private String livestate_qingxu;

    private String livestate_yundong;

    private String livestate_tixing;

    private String livestate_xuezhi;

    private String livestate_xuetang;

    private String livestate_danguchun;

    private String livestate_tangniaobing;

    /**
     * @return the personid
     */
    public Integer getPersonid() {
        return personid;
    }

    /**
     * @param personid the personid to set
     */
    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    /**
     * @return the userid
     */
    public Integer getUserid() {
        return userid;
    }

    /**
     * @param userid the userid to set
     */
    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    /**
     * @return the mainpersonid
     */
    public Integer getMainpersonid() {
        return mainpersonid;
    }

    /**
     * @param mainpersonid the mainpersonid to set
     */
    public void setMainpersonid(Integer mainpersonid) {
        this.mainpersonid = mainpersonid;
    }

    /**
     * @return the usertype
     */
    public String getUsertype() {
        return usertype;
    }

    /**
     * @param usertype the usertype to set
     */
    public void setUsertype(String usertype) {
        this.usertype = usertype;
    }

    /**
     * @return the fullname
     */
    public String getFullname() {
        return fullname;
    }

    /**
     * @param fullname the fullname to set
     */
    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    /**
     * @return the sextype
     */
    public Integer getSextype() {
        return sextype;
    }

    /**
     * @param sextype the sextype to set
     */
    public void setSextype(Integer sextype) {
        this.sextype = sextype;
    }

    /**
     * @return the birthday
     */
    public Date getBirthday() {
        return birthday;
    }

    /**
     * @param birthday the birthday to set
     */
    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    /**
     * @return the mobile
     */
    public String getMobile() {
        return mobile;
    }

    /**
     * @param mobile the mobile to set
     */
    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    /**
     * @return the cityid
     */
    public Integer getCityid() {
        return cityid;
    }

    /**
     * @param cityid the cityid to set
     */
    public void setCityid(Integer cityid) {
        this.cityid = cityid;
    }

    /**
     * @return the healthid
     */
    public Integer getHealthid() {
        return healthid;
    }

    /**
     * @param healthid the healthid to set
     */
    public void setHealthid(Integer healthid) {
        this.healthid = healthid;
    }

    /**
     * @return the weight
     */
    public BigDecimal getWeight() {
        return weight;
    }

    /**
     * @param weight the weight to set
     */
    public void setWeight(BigDecimal weight) {
        this.weight = weight;
    }

    /**
     * @return the height
     */
    public BigDecimal getHeight() {
        return height;
    }

    /**
     * @param height the height to set
     */
    public void setHeight(BigDecimal height) {
        this.height = height;
    }

    /**
     * @return the isfamilydiabetes
     */
    public String getIsfamilydiabetes() {
        return isfamilydiabetes;
    }

    /**
     * @param isfamilydiabetes the isfamilydiabetes to set
     */
    public void setIsfamilydiabetes(String isfamilydiabetes) {
        this.isfamilydiabetes = isfamilydiabetes;
    }

    /**
     * @return the livestate_xiyan
     */
    public String getLivestate_xiyan() {
        return livestate_xiyan;
    }

    /**
     * @param livestate_xiyan the livestate_xiyan to set
     */
    public void setLivestate_xiyan(String livestate_xiyan) {
        this.livestate_xiyan = livestate_xiyan;
    }

    /**
     * @return the livestate_yinshi
     */
    public String getLivestate_yinshi() {
        return livestate_yinshi;
    }

    /**
     * @param livestate_yinshi the livestate_yinshi to set
     */
    public void setLivestate_yinshi(String livestate_yinshi) {
        this.livestate_yinshi = livestate_yinshi;
    }

    /**
     * @return the livestate_hejiu
     */
    public String getLivestate_hejiu() {
        return livestate_hejiu;
    }

    /**
     * @param livestate_hejiu the livestate_hejiu to set
     */
    public void setLivestate_hejiu(String livestate_hejiu) {
        this.livestate_hejiu = livestate_hejiu;
    }

    /**
     * @return the livestate_shuimian
     */
    public String getLivestate_shuimian() {
        return livestate_shuimian;
    }

    /**
     * @param livestate_shuimian the livestate_shuimian to set
     */
    public void setLivestate_shuimian(String livestate_shuimian) {
        this.livestate_shuimian = livestate_shuimian;
    }

    /**
     * @return the livestate_qingxu
     */
    public String getLivestate_qingxu() {
        return livestate_qingxu;
    }

    /**
     * @param livestate_qingxu the livestate_qingxu to set
     */
    public void setLivestate_qingxu(String livestate_qingxu) {
        this.livestate_qingxu = livestate_qingxu;
    }

    /**
     * @return the livestate_yundong
     */
    public String getLivestate_yundong() {
        return livestate_yundong;
    }

    /**
     * @param livestate_yundong the livestate_yundong to set
     */
    public void setLivestate_yundong(String livestate_yundong) {
        this.livestate_yundong = livestate_yundong;
    }

    /**
     * @return the livestate_tixing
     */
    public String getLivestate_tixing() {
        return livestate_tixing;
    }

    /**
     * @param livestate_tixing the livestate_tixing to set
     */
    public void setLivestate_tixing(String livestate_tixing) {
        this.livestate_tixing = livestate_tixing;
    }

    /**
     * @return the livestate_xuezhi
     */
    public String getLivestate_xuezhi() {
        return livestate_xuezhi;
    }

    /**
     * @param livestate_xuezhi the livestate_xuezhi to set
     */
    public void setLivestate_xuezhi(String livestate_xuezhi) {
        this.livestate_xuezhi = livestate_xuezhi;
    }

    /**
     * @return the livestate_xuetang
     */
    public String getLivestate_xuetang() {
        return livestate_xuetang;
    }

    /**
     * @param livestate_xuetang the livestate_xuetang to set
     */
    public void setLivestate_xuetang(String livestate_xuetang) {
        this.livestate_xuetang = livestate_xuetang;
    }

    /**
     * @return the livestate_danguchun
     */
    public String getLivestate_danguchun() {
        return livestate_danguchun;
    }

    /**
     * @param livestate_danguchun the livestate_danguchun to set
     */
    public void setLivestate_danguchun(String livestate_danguchun) {
        this.livestate_danguchun = livestate_danguchun;
    }

    /**
     * @return the livestate_tangniaobing
     */
    public String getLivestate_tangniaobing() {
        return livestate_tangniaobing;
    }

    /**
     * @param livestate_tangniaobing the livestate_tangniaobing to set
     */
    public void setLivestate_tangniaobing(String livestate_tangniaobing) {
        this.livestate_tangniaobing = livestate_tangniaobing;
    }

}
