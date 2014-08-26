/**
 * 
 */
package cn.kangbao.webapp.web.controller;

/**
 * <Description> 数据库表名<br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月22日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.controller <br>
 */

public final class IWebConstans {

    /****************************************************************/
    /** 当前session中的(SysUser)sysUser,当前登录用户对象 */
    public final static String SESSIONUSER = "sessionuser";

    /** 当前session中的(Person)person,当前登录用户对象对应的所有person List */
    public final static String SESSIONPERSONLIST = "sessionpersonlist";

    /** 当前session中的(Person)person,当前登录用户对象对应的main_person */
    public final static String SESSIONMAINPERSON = "sessionmainperson";

    /** 当前session中的main_person (String)fullname,用户昵称 */
    public final static String SESSIONTHISMAINUSERNAME = "sessionThisMainUserName";

    /**
     * 其他通过Ajax提交操作，后台处理完后，返回给前台的结果集中的success字段名
     */
    public static final String JSON_RESULT_SUCCESS = "success";

    /**
     * 其他通过Ajax提交操作，后台处理完后，返回给前台的结果集中的msg字段名
     */
    public static final String JSON_RESULT_MSG = "msg";

    /**
     * 其他通过Ajax提交操作，后台处理完后，返回给前台的结果集中的jsonData字段名
     */
    public static final String JSON_RESULT_JSONDATA = "jsonData";

    /** 操作类型，添加 */
    public static final String OPERATE_ADD = "A";

    /** 操作类型，修改 */
    public static final String OPERATE_UPDATE = "U";

    /** 操作类型，删除 */
    public static final String OPERATE_DELETE = "D";
    
    /** 字段DR的有效值*/
    public static final int FIELD_DR_ACTVED = 0;
    
    /** 用户类型  病人*/
    public static final String USERTYPE_PATIENT="0";
    /** 用户类型  医生*/
    public static final String USERTYPE_DOCTOR ="1";

    /** 系统中各个表的常量 */
    public final static String HOSPITAL = "hospital";

    public final static String HOSPITAL_DOCTOR = "hospital_doctor";

    public final static String MESSAGE_USER = "message_user";

    public final static String PATIENT_BLOODPRESSURE = "patient_bloodpressure";

    public final static String PATIENT_BLOODSUGAR = "patient_bloodsugar";

    public final static String PATIENT_HEALTH = "patient_health";

    public final static String PATIENT_LIVESTATE = "patient_livestate";

    public final static String PERSON = "person";

    public final static String SEERECORD = "seerecord";

    public final static String SYS_BLOORSTANDARD = "sys_bloorstandard";

    public final static String SYS_CITY = "sys_city";

    public final static String SYS_DICT = "sys_dict";

    public final static String SYS_KEYTABLE = "sys_keytable";

    public final static String SYS_MESSAGE = "sys_message";

    public final static String SYS_USER = "sys_user";
}
