/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.multipart.support.ByteArrayMultipartFileEditor;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.common.util.TableSeqUtil;

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
        return TableSeqUtil.getSequence(tableName);
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
    public Integer[] getPkSequenceArray(String tableName, int count) throws BaseAppException {
        return TableSeqUtil.getSequenceBatch(tableName, count);
    }

    /**
     * 注册日期转换器,统一在父类里做了，以后可以改成在spring配置文件里配，需要研究下
     * 
     * @param binder
     * @throws ServletException
     */
    @InitBinder
    protected void initBinder(WebDataBinder binder) throws ServletException {
        binder.registerCustomEditor(byte[].class, new ByteArrayMultipartFileEditor());

        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd");
        dateFormat.setLenient(false);
        binder.registerCustomEditor(Date.class, new CustomDateEditor(dateFormat, false));
    }
}
