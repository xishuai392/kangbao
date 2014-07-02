package cn.kangbao.common.exception;

/**
 * 系统异常编码
 */
public class SysExceptionCode {

	/** 未知异常 */
	public final static String UNKNOW_EXPCEPTION = "APP-00-0000";

	/** 数据库操作异常 */
	public final static String DB_OPER_EXPCEPTION = "APP-00-0001";

	/** 主键冲突 */
	public final static String DUPLICATE_KEY_EXCEPTION  = "APP-00-0002";

	/** 数据'MODUAL_ID'非空 异常*/
	public final static String DATA_INTEGRITY_VIOLATION_EXCEPTION  = "APP-00-0003";

	/** sql语句错误 */
	public final static String BAD_SQL_GRAMMAR_EXCEPTION  = "APP-00-0004";

	/** 数据库连接错误 */
	public static final String DATABASE_ACCESS_EXCEPTION  = "APP-00-0005";

	/** 数据库连接错误 */
	public static final String DB_POOL_BUSY = "APP-00-0006";

	/** */
	public static final String INSTANCE_EXCEPTION = "APP-00-0007";

	/**  */
	public static final String LOOKUP_DATASOURCE_ERROR = "APP-00-0008";

	/**  */
	public static final String CONFIG_PROPERTIES_NULL = "APP-00-0009";

	/** 文件访问错误 ！*/
	public static final String FILE_ACCESS_ERROR = "APP-00-0010";

	/**  */
	public static final String UNZIP_FILE_NAME_ALARM = "APP-00-0011";

	/**  */
	public static final String ERROR_CONFIG_PARAM_VALUE = "APP-00-0012";

	/**  */
	public static final String NULL_INTERFACE_FILE = "APP-00-0013";

	/**  */
	public static final String NO_FIND_INTERFACE_FILE = "APP-00-0014";

	/**  */
	public static final String READ_INTERFACE_FILE_FAIL = "APP-00-0015";

	/**  */
	public static final String NO_FIND_LOG = "APP-00-0016";

	/**  */
	public static final String OPEN_LOG_FAIL = "APP-00-0017";

	/**  */
	public static final String FTP_PARAM_ERR = "APP-00-0018";

	/**  */
	public static final String FTP_IO_ERR = "APP-00-0019";

	/**  */
	public static final String FTP_IS_DISCONNECTED = "APP-00-0020";

	/**  */
	public static final String NO_VALIDE_RESULT = "APP-00-0021";

	/**  */
	public static final String NO_VALIDE_PARAM = "APP-00-0022";

	/**  */
	public static final String NO_THIS_OPER_TYPE = "APP-00-0023";

	/**  */
	public static final String INVALID_LICENSE = "APP-00-0025";

	/**  */
	public static final String UPDATE_ERR = "APP-00-0026";

	/**  */
	public static final String OVER_LICENSE_USER_NUM = "APP-00-0027";

	/**  */
	public static final String EXPIRE_LICENSE = "APP-00-0028";
	
	/**   */
	public static final String VNO_INFO_EXCEPTION = "APP-00-0029";


}
