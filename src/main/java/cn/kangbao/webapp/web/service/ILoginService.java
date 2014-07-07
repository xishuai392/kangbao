/**
 * 
 */
package cn.kangbao.webapp.web.service;

import cn.kangbao.webapp.db.appmgr.entity.SysUser;

/**
 * 
 * <Description> <br> 
 *  
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月7日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.service <br>
 */

public interface ILoginService {

    public SysUser userLogin(String userName, String password) throws Exception;
}
