/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;

import org.springframework.web.context.request.RequestContextHolder;
import org.springframework.web.context.request.ServletRequestAttributes;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.webapp.db.appmgr.entity.Person;
import cn.kangbao.webapp.db.appmgr.entity.SysUser;
import cn.kangbao.webapp.web.util.SeqUtil;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014-4-23 <br>
 * @since V1.0<br>
 * @see com.ztesoft.appmgr.web.controller <br>
 */

public abstract class AbstractBaseController {
    /**
     * 操作结果，供前台展现，非AJAX情况下使用
     */
    protected String operateContext;

    /**
     * 操作类型，供前台展现，
     */
    protected String operateType;

    /**
     * 根据数据库表名，获取单个主键
     * 
     * @author pan.xiaobo<br>
     * @version 1.0<br>
     * @CreateDate 2014-5-23 <br>
     * @param tableName
     * @return
     * @throws BaseAppException
     */
    public Integer getPkSequence(String tableName) throws BaseAppException {
        return SeqUtil.getSequence(tableName);
    }

    /**
     * 根据数据库表名，批量获取多条主键
     * 
     * @author pan.xiaobo<br>
     * @version 1.0<br>
     * @CreateDate 2014-5-23 <br>
     * @param tableName
     * @param count
     * @return
     * @throws BaseAppException
     */
    public Integer[] getPkSequenceArray(String tableName, int count)
            throws BaseAppException {
        return SeqUtil.getSequenceBatch(tableName, count);
    }

    /**
     * 注册日期转换器,统一在父类里做了，以后可以改成在spring配置文件里配，需要研究下
     * 
     * @param binder
     * @throws ServletException
     */
//    @InitBinder
//    protected void initBinder(WebDataBinder binder) throws ServletException {
//        binder.registerCustomEditor(byte[].class,
//                new ByteArrayMultipartFileEditor());
//
//        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
//        dateFormat.setLenient(false);
//        binder.registerCustomEditor(Date.class, new CustomDateEditor(
//                dateFormat, false));
//    }

    /**
     * 拼装返回结果，建议用这个
     * 
     * @author pan.xiaobo<br>
     * @version 1.0<br>
     * @CreateDate 2014-5-16 <br>
     * @param <T>
     * @param isDone
     * @param msg
     * @param jsonData
     * @return
     */
    protected <T extends Serializable> Map getResultMap(boolean isDone,
            String msg, T jsonData) {
        Map attributes = new HashMap();
        attributes.put(IWebConstans.JSON_RESULT_SUCCESS, isDone);
        attributes.put(IWebConstans.JSON_RESULT_MSG, msg);
        attributes.put(IWebConstans.JSON_RESULT_JSONDATA, jsonData);

        return attributes;
    }

    protected Map getResultMap(String msg) {
        return getResultMap(true, msg, null);
    }

    protected Map getResultMap() {
        return getResultMap(true, "操作成功！", null);
    }

    protected <T extends Serializable> Map getResultMap(T jsonData) {
        return getResultMap(true, "操作成功！", jsonData);
    }

    /**
     * 获取request对象
     * 
     * @return
     */
    protected HttpServletRequest getRequest() {
        HttpServletRequest request = ((ServletRequestAttributes) RequestContextHolder
                .getRequestAttributes()).getRequest();
        return request;
    }

    /**
     * 获取session中的登录用户对象
     * 
     * @return
     */
    public SysUser getSessionSysUser() {
        SysUser newSysUser = null;
        HttpServletRequest request = getRequest();
        newSysUser = (SysUser) request.getSession().getAttribute(
                IWebConstans.SESSIONUSER);
        return newSysUser;
    }

    /**
     * 获取session中的登录用户对于的主person
     * 
     * @return
     */
    public Person getSessionMainPerson() {
        Person mainPerson = null;
        HttpServletRequest request = getRequest();
        mainPerson = (Person) request.getSession().getAttribute(
                IWebConstans.SESSIONMAINPERSON);
        return mainPerson;
    }

    /**
     * @return the operateContext
     */
    public String getOperateContext() {
        return operateContext;
    }

    /**
     * @param operateContext the operateContext to set
     */
    public void setOperateContext(String operateContext) {
        this.operateContext = operateContext;
    }

    /**
     * @return the operateType
     */
    public String getOperateType() {
        return operateType;
    }

    /**
     * @param operateType the operateType to set
     */
    public void setOperateType(String operateType) {
        this.operateType = operateType;
    }

}
