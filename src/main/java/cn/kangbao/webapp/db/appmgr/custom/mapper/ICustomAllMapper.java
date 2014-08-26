/**
 * 
 */
package cn.kangbao.webapp.db.appmgr.custom.mapper;

import java.util.List;
import java.util.Map;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年8月26日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.db.appmgr.custom.mapper <br>
 */

public interface ICustomAllMapper {
    List<Map<String, Object>> selectPatientLivestateAndSysDict(Map<String,Object> paramMap);
}
