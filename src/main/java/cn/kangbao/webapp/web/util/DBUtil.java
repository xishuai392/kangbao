package cn.kangbao.webapp.web.util;

import java.util.ArrayList;
import java.util.List;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.common.plugin.SpringContextHolder;
import cn.kangbao.webapp.db.appmgr.custom.arg.DBValidateArg;
import cn.kangbao.webapp.db.appmgr.custom.arg.FieldInfoArg;
import cn.kangbao.webapp.db.appmgr.custom.dao.DBValidateDAO;

/**
 * <Description> 数据库校验类：提供重名和引用的校验；提供最大序号获取的方法<br>
 */
public class DBUtil {

    private static DBValidateDAO dao = (DBValidateDAO) SpringContextHolder
            .getBean("dbValidateDAO");

    /**
     * Description: 校验某个表的某个字段是否存在 指定的字段值<br>
     * 组装类似SQL：SELECT COUNT(*) FROM tableName WHERE verifyFieldName = verifyFieldValue
     *
     * @param tableName 表名
     * @param verifyFieldName 字段名
     * @param verifyFieldValue 字段值
     * @return
     * @throws BaseAppException <br>
     * @author song.chenghao<br>
     */
    public static boolean isSameValue(String tableName, String verifyFieldName,
            String verifyFieldValue) throws BaseAppException {
        return isSameValue(tableName, verifyFieldName, verifyFieldValue, true);
    }

    /**
     * Description: <br>
     *
     * @param tableName
     * @param verifyFieldName
     * @param verifyFieldValue
     * @param caseSensitive TODO 是否区分字段值大小写，暂时都是区分，待改造
     * @return
     * @throws BaseAppException <br>
     * @author song.chenghao<br>
     */
    public static boolean isSameValue(String tableName, String verifyFieldName,
            String verifyFieldValue, boolean caseSensitive)
            throws BaseAppException {
        List<FieldInfoArg> verifyFieldDtoList = new ArrayList<FieldInfoArg>();
        FieldInfoArg fieldArg = new FieldInfoArg();
        fieldArg.setFieldName(verifyFieldName);
        fieldArg.setFieldValue(verifyFieldValue);
        fieldArg.setCaseSensitive(caseSensitive);
        verifyFieldDtoList.add(fieldArg);

        DBValidateArg arg = new DBValidateArg();
        arg.setTableName(tableName);
        arg.setVerifyFieldList(verifyFieldDtoList);
        return isSameValue(arg);
    }

    /**
     * Description: 修改使用：排除当前修改的对象然后去校验重复<br>
     * 组装类似SQL：SELECT COUNT(*) FROM tableName WHERE verifyFieldName = verifyFieldValue AND keyFieldName <> keyFiledValue
     *
     * @param tableName
     * @param verifyFieldName
     * @param verifyFieldValue
     * @param keyFieldName 主键名
     * @param keyFiledValue 主键值
     * @return
     * @throws BaseAppException <br>
     * @author song.chenghao<br>
     */
    public static boolean isSameValue(String tableName, String verifyFieldName,
            String verifyFieldValue, String keyFieldName, Integer keyFiledValue)
            throws BaseAppException {
        return isSameValue(tableName, verifyFieldName, verifyFieldValue, true,
                keyFieldName, keyFiledValue);
    }

    public static boolean isSameValue(String tableName, String verifyFieldName,
            String verifyFieldValue, boolean verifyFieldCaseSensitive,
            String keyFieldName, Integer keyFiledValue) throws BaseAppException {
        List<FieldInfoArg> verifyFieldDtoList = new ArrayList<FieldInfoArg>();
        FieldInfoArg fieldArg = new FieldInfoArg();
        fieldArg.setFieldName(verifyFieldName);
        fieldArg.setFieldValue(verifyFieldValue);
        fieldArg.setCaseSensitive(verifyFieldCaseSensitive);
        verifyFieldDtoList.add(fieldArg);

        List<FieldInfoArg> keyFieldList = new ArrayList<FieldInfoArg>();
        FieldInfoArg keyArg = new FieldInfoArg();
        keyArg.setFieldName(keyFieldName);
        keyArg.setFieldValue(keyFiledValue);
        keyFieldList.add(keyArg);

        DBValidateArg arg = new DBValidateArg();
        arg.setTableName(tableName);
        arg.setVerifyFieldList(verifyFieldDtoList);
        arg.setKeyFieldList(keyFieldList);
        return isSameValue(arg);
    }

    /**
     * 两个字段值
     * 
     * @param tableName
     * @param verifyFieldName
     * @param verifyFieldValue
     * @param verifyFieldName2
     * @param verifyFieldValue2
     * @return
     * @throws BaseAppException
     */
    public static boolean isSameValue(String tableName, String verifyFieldName,
            String verifyFieldValue, String verifyFieldName2,
            String verifyFieldValue2) throws BaseAppException {
        List<FieldInfoArg> verifyFieldDtoList = new ArrayList<FieldInfoArg>();
        FieldInfoArg fieldArg = new FieldInfoArg();
        fieldArg.setFieldName(verifyFieldName);
        fieldArg.setFieldValue(verifyFieldValue);
        fieldArg.setCaseSensitive(false);
        verifyFieldDtoList.add(fieldArg);

        FieldInfoArg fieldArg2 = new FieldInfoArg();
        fieldArg2.setFieldName(verifyFieldName2);
        fieldArg2.setFieldValue(verifyFieldValue2);
        fieldArg2.setCaseSensitive(false);
        verifyFieldDtoList.add(fieldArg2);

        DBValidateArg arg = new DBValidateArg();
        arg.setTableName(tableName);
        arg.setVerifyFieldList(verifyFieldDtoList);
        return isSameValue(arg);
    }

    /**
     * 字符串 字符串 相等 整型 不等
     * 
     * @param tableName
     * @param verifyFieldName
     * @param verifyFieldValue
     * @param verifyFieldName2
     * @param verifyFieldValue2
     * @return
     * @throws BaseAppException
     */
    public static boolean isSameValue(String tableName, String verifyFieldName,
            String verifyFieldValue, String verifyFieldName2,
            String verifyFieldValue2, String keyFieldName, Integer keyFiledValue)
            throws BaseAppException {
        List<FieldInfoArg> verifyFieldDtoList = new ArrayList<FieldInfoArg>();
        FieldInfoArg fieldArg = new FieldInfoArg();
        fieldArg.setFieldName(verifyFieldName);
        fieldArg.setFieldValue(verifyFieldValue);
        fieldArg.setCaseSensitive(false);
        verifyFieldDtoList.add(fieldArg);

        FieldInfoArg fieldArg2 = new FieldInfoArg();
        fieldArg2.setFieldName(verifyFieldName2);
        fieldArg2.setFieldValue(verifyFieldValue2);
        fieldArg2.setCaseSensitive(false);
        verifyFieldDtoList.add(fieldArg2);

        List<FieldInfoArg> keyFieldList = new ArrayList<FieldInfoArg>();
        FieldInfoArg keyArg = new FieldInfoArg();
        keyArg.setFieldName(keyFieldName);
        keyArg.setFieldValue(keyFiledValue);
        keyFieldList.add(keyArg);

        DBValidateArg arg = new DBValidateArg();
        arg.setTableName(tableName);
        arg.setVerifyFieldList(verifyFieldDtoList);
        arg.setKeyFieldList(keyFieldList);
        return isSameValue(arg);
    }

    /**
     * 字符串 整型 字符串
     * 
     * @param tableName
     * @param verifyFieldName
     * @param verifyFieldValue
     * @param verifyFieldName2
     * @param verifyFieldValue2
     * @return
     * @throws BaseAppException
     */
    public static boolean isSameValue(String tableName, String verifyFieldName,
            String verifyFieldValue, String verifyFieldName2,
            Integer verifyFieldValue2, String keyFieldName, String keyFiledValue)
            throws BaseAppException {
        List<FieldInfoArg> verifyFieldDtoList = new ArrayList<FieldInfoArg>();
        FieldInfoArg fieldArg = new FieldInfoArg();
        fieldArg.setFieldName(verifyFieldName);
        fieldArg.setFieldValue(verifyFieldValue);
        fieldArg.setCaseSensitive(false);
        verifyFieldDtoList.add(fieldArg);

        FieldInfoArg fieldArg2 = new FieldInfoArg();
        fieldArg2.setFieldName(verifyFieldName2);
        fieldArg2.setFieldValue(verifyFieldValue2);
        fieldArg2.setCaseSensitive(false);
        verifyFieldDtoList.add(fieldArg2);

        List<FieldInfoArg> keyFieldList = new ArrayList<FieldInfoArg>();
        FieldInfoArg keyArg = new FieldInfoArg();
        keyArg.setFieldName(keyFieldName);
        keyArg.setFieldValue(keyFiledValue);
        keyFieldList.add(keyArg);

        DBValidateArg arg = new DBValidateArg();
        arg.setTableName(tableName);
        arg.setVerifyFieldList(verifyFieldDtoList);
        arg.setKeyFieldList(keyFieldList);
        return isSameValue(arg);
    }

    /**
     * Description: 自定义校验arg，可以传递多个属性和关键字校验<br>
     *
     * @param arg
     * @return
     * @throws BaseAppException <br>
     * @author song.chenghao<br>
     */
    public static boolean isSameValue(DBValidateArg arg)
            throws BaseAppException {
        int count = dao.isSameValue(arg);
        if (count > 0) {
            return Boolean.TRUE;
        }

        return Boolean.FALSE;
    }

    /**
     * Description: 校验某个字段是否被某个表引用：比如删除用户的时候校验用户是否有用户角色，可以如下调用<br>
     * isReferenced("AM_USER_ROLE", "USER_ID", 1)
     *
     * @param tableName
     * @param fieldName
     * @param fieldValue
     * @return
     * @throws BaseAppException <br>
     * @author song.chenghao<br>
     */
    public static boolean isReferenced(String tableName, String fieldName,
            Integer fieldValue) throws BaseAppException {
        return isSameValue(tableName, fieldName, fieldValue.toString());
    }

}
