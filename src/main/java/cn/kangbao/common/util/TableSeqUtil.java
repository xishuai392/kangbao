package cn.kangbao.common.util;

import org.springframework.util.StringUtils;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.webapp.db.appmgr.custom.dao.SequenceDAO;

/**
 * 获取表序列主键的工具类 <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月7日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.common.util <br>
 */
public class TableSeqUtil {

    private static SequenceDAO sequenceDAO = (SequenceDAO) SpringContextHolderUtils.getBean("sequenceDAO");

    /**
     * 调用数据库获取sequence值
     * 
     * @param tableName 表名
     * @param count 获取序列个数
     * @return tableName的当前序列
     * @throws BaseAppException
     */
    private static Integer sequenceValue(String tableName, Integer count) throws BaseAppException {
        if (StringUtils.isEmpty(count) || StringUtils.isEmpty(tableName)) {
            throw new BaseAppException("tableName或者count参数不正确");
        }

        if (sequenceDAO == null) {
            sequenceDAO = (SequenceDAO) SpringContextHolderUtils.getBean("sequenceDAO");
        }
        return sequenceDAO.selectSequence(tableName, count);
    }

    /**
     * 批量获取sequence
     * 
     * @param tableName 表名
     * @param count 序列个数
     * @return
     * @throws BaseAppException
     */
    public static Integer[] getSequenceBatch(String tableName, Integer count) throws BaseAppException {
        Integer sequenceId = sequenceValue(tableName, count);
        Integer[] result = new Integer[count];
        int i = 0;
        while (i < count) {
            result[i] = sequenceId++;
            i++;
        }
        return result;
    }

    /**
     * 获取sequence
     * 
     * @param tableName 表名
     * @return tableName当前序列
     * @throws BaseAppException
     */
    public static Integer getSequence(String tableName) throws BaseAppException {
        return sequenceValue(tableName, 1);
    }

}
