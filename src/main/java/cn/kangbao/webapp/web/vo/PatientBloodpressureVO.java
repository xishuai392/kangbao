/**
 * 
 */
package cn.kangbao.webapp.web.vo;

import java.util.Date;

import org.apache.commons.lang.StringUtils;
import org.springframework.format.annotation.DateTimeFormat;

import cn.kangbao.common.dto.AbstractDto;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年9月2日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.vo <br>
 */

public class PatientBloodpressureVO extends AbstractDto {
    private Integer measurementid;

    public void setMeasurementid(Integer measurementid) {
        this.measurementid = measurementid;
    }

    public Integer getMeasurementid() {
        return measurementid;
    }

    private Integer personid;

    public void setPersonid(Integer personid) {
        this.personid = personid;
    }

    public Integer getPersonid() {
        return personid;
    }

    private Integer upnum;

    public void setUpnum(Integer upnum) {
        this.upnum = upnum;
    }

    public Integer getUpnum() {
        return upnum;
    }

    private Integer downnum;

    public void setDownnum(Integer downnum) {
        this.downnum = downnum;
    }

    public Integer getDownnum() {
        return downnum;
    }

    private Integer heartrate;

    public void setHeartrate(Integer heartrate) {
        this.heartrate = heartrate;
    }

    public Integer getHeartrate() {
        return heartrate;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    private Date testtime;

    public void setTesttime(Date testtime) {
        this.testtime = testtime;
    }

    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
    public Date getTesttime() {
        return testtime;
    }

    private Integer feelingstate;

    public void setFeelingstate(Integer feelingstate) {
        this.feelingstate = feelingstate;
    }

    public Integer getFeelingstate() {
        return feelingstate;
    }

    private String feelingdesc;

    public void setFeelingdesc(String feelingdesc) {
        this.feelingdesc = feelingdesc;
    }

    public String getFeelingdesc() {
        return StringUtils.isBlank(feelingdesc) ? feelingdesc : feelingdesc
                .trim();
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

    private String evaluate;

    /**
     * @return the evaluate
     */
    public String getEvaluate() {
        return evaluate;
    }

    /**
     * @param evaluate the evaluate to set
     */
    public void setEvaluate(String evaluate) {
        this.evaluate = evaluate;
    }

}
