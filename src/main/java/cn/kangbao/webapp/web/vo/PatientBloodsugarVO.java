package cn.kangbao.webapp.web.vo;

import java.math.BigDecimal;
import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.format.annotation.DateTimeFormat;

import cn.kangbao.common.dto.AbstractDto;

public class PatientBloodsugarVO extends AbstractDto {

    private Integer bloodsugarid;

    public void setBloodsugarid(Integer bloodsugarid) {
        this.bloodsugarid = bloodsugarid;
    }

    public Integer getBloodsugarid() {
        return bloodsugarid;
    }

    private BigDecimal bloodsugarnum;

    public void setBloodsugarnum(BigDecimal bloodsugarnum) {
        this.bloodsugarnum = bloodsugarnum;
    }

    public BigDecimal getBloodsugarnum() {
        return bloodsugarnum;
    }

    private String influence;

    public void setInfluence(String influence) {
        this.influence = influence;
    }

    public String getInfluence() {
        return StringUtils.isBlank(influence) ? influence : influence.trim();
    }

    private Integer personid;

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public Integer getPersonid() {
        return personid;
    }

    private String testperiod;

    public void setTestperiod(String testperiod) {
        this.testperiod = testperiod;
    }

    public String getTestperiod() {
        return StringUtils.isBlank(testperiod) ? testperiod : testperiod.trim();
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date testtime;

    public void setTesttime(Date testtime) {
        this.testtime = testtime;
    }

    public Date getTesttime() {
        return testtime;
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

}