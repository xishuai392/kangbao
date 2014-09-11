package cn.kangbao.webapp.web.util;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.common.plugin.SpringContextHolder;
import cn.kangbao.common.util.Utils;
import cn.kangbao.webapp.db.appmgr.custom.dao.DBSequenceDAO;

/**
 * <Description> 序号处理器<br>
 * 1、获取序列 <br>
 * 2、获取最大编号 <br>
 * 
 */
public class SeqUtil {

    private static DBSequenceDAO dao = (DBSequenceDAO) SpringContextHolder
            .getBean("dbSequenceDAO");

    /**
     * 调用数据库获取sequence值
     * 
     * @param tableName 表名
     * @param count 获取序列个数
     * @return tableName的当前序列
     * @throws BaseAppException
     */
    private static Integer sequenceValue(String tableName, Integer count)
            throws BaseAppException {
        if (Utils.isEmpty(count) || Utils.isEmpty(tableName)) {
            throw new BaseAppException("tableName或者count参数不正确");
        }

        return dao.selectSequence(tableName, count);
    }

    /**
     * 批量获取sequence
     * 
     * @param tableName 表名
     * @param count 序列个数
     * @return
     * @throws BaseAppException
     */
    public static Integer[] getSequenceBatch(String tableName, Integer count)
            throws BaseAppException {
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

    /**
     * Description: 取得某张表在一个主键指定下的另外一个字段的最大序号<br>
     * 构造SQL如下：SELECT MAX(colName) FROM tableName WHERE idName = id
     * 
     * @author song.chenghao<br>
     * @param tableName
     * @param colName
     * @param idName
     * @param id
     * @return <br>
     */
    public synchronized static Integer maxSeq(String tableName, String colName,
            String idName, Integer id) {
        Integer currentSeq = dao.maxSeq(tableName, colName, idName, id);
        if (Utils.isEmpty(currentSeq) || currentSeq == 0) {
            return 1;
        }

        return ++currentSeq;
    }

}
