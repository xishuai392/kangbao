package cn.kangbao.webapp.web.constant;

/**
 * <Description>权限管理模块的错误编码 <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年9月25日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.constant <br>
 */
public class PrivErrorCode {
    /** 删除角色失败，因为已经被用户使用 */
    public static final String HINT_ROLE_REF_USER = "APP-PRIV-0001";

    /** 用户名称已经存在，请重新输入！ */
    public static final String HINT_USER_NAME_EXIST = "APP-PRIV-0002";

    /** 用户旧密码输入不正确，请重新输入！ */
    public static final String HINT_USER_PASSWORD_ERROR = "APP-PRIV-0003";

    /** 菜单已经被目录引用，请重新选择！ */
    public static final String HINT_MENU_ID_REF_DIR = "APP-PRIV-0004";

    /** 菜单名称已经存在，请重新选择！ */
    public static final String HINT_MENU_NAME_EXIST = "APP-PRIV-0005";

    /** 角色名称已经存在，请重新输入！ */
    public static final String HINT_ROLE_NAME_EXIST = "APP-PRIV-0006";

    /** 目录名称已经存在，请重新输入！ */
    public static final String HINT_DIR_NAME_EXIST = "APP-PRIV-0007";

    /** 属性名称已经存在，请重新输入！ */
    public static final String HINT_ATTR_NAME_EXIST = "APP-PRIV-0008";
}
