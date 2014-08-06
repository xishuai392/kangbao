/**
 * 
 */
package cn.kangbao.webapp.web.service.impl;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.ibatis.session.RowBounds;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.webapp.db.appmgr.arg.SysUserArg;
import cn.kangbao.webapp.db.appmgr.arg.SysUserArg.SysUserCriteria;
import cn.kangbao.webapp.db.appmgr.dao.AppmgrSysUserDao;
import cn.kangbao.webapp.db.appmgr.entity.SysUser;
import cn.kangbao.webapp.web.service.ILoginService;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月7日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.service.impl <br>
 */
@Service("loginService")
public class LoginServiceImpl implements ILoginService {

    @Autowired
    private AppmgrSysUserDao appmgrSysUserDao;

    /*
     * (non-Javadoc)
     * @see com.ztesoft.appmgr.web.service.ILoginService#userLogin(java.lang.String, java.lang.String)
     */
    @Override
    public SysUser userLogin(String userName, String password) throws BaseAppException {
        Map<String, String> params = new HashMap<String, String>();
        params.put("user_name", userName);
        params.put("password", password);
        SysUserArg arg = new SysUserArg();
        SysUserCriteria criteria = arg.createCriteria();
        criteria.andUsernameEqualTo(userName);
        criteria.andPasswordEqualTo(password);
        List<SysUser> listUsers = appmgrSysUserDao.selectByArgAndPage(arg, new RowBounds(0, 10));
        if (null == listUsers || listUsers.size() == 0)
            throw new BaseAppException("用户不存在或密码错误！");
        return listUsers.get(0);
    }

}
