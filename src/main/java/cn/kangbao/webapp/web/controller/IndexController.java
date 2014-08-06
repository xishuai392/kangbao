/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.common.util.Constants;
import cn.kangbao.webapp.db.appmgr.entity.SysUser;

/**
 * <Description> <br>
 * 主界面
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月7日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.controller <br>
 */
@Controller
@RequestMapping("/steward")
public class IndexController extends AbstractBaseController {
    LoggerManager logger = LoggerManager.getLogger(IndexController.class);

    @RequestMapping(value = "/index.html")
    public String index(HttpServletRequest request, Model model) {
        request.getSession().setAttribute(IWebConstans.SESSIONUSER, new SysUser());

        if (null == request.getSession() || null == request.getSession().getAttribute(IWebConstans.SESSIONUSER)) {
            // 没登陆
            return "login";
        }

        return "login/main";
    }
}
