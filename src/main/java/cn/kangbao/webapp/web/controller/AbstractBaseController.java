/**
 * 
 */
package cn.kangbao.webapp.web.controller;

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
}
