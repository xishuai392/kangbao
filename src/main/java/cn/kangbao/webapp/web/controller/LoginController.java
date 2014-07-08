/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.common.util.Constants;
import cn.kangbao.webapp.db.appmgr.entity.Person;
import cn.kangbao.webapp.db.appmgr.entity.SysUser;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月7日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.controller <br>
 */
@Controller
public class LoginController extends AbstractBaseController {
    LoggerManager logger = LoggerManager.getLogger(LoginController.class);

    @RequestMapping(value = "login/loginCheck.html", method = RequestMethod.POST)
    public ModelAndView loginCheck(HttpServletRequest request, SysUser sysUser) {
        // 验证用户账号与密码是否正确
        SysUser appUser = new SysUser();
        appUser.setUserid(1);
        appUser.setUsername("admin");
        appUser.setPassword("1");

        Person person = new Person();
        person.setUserid(1);
        person.setPersonid(1);
        person.setFullname("超级管理员");

        request.getSession().setAttribute(Constants.SESSIONUSER, appUser);
        request.getSession().setAttribute(Constants.SESSIONPERSON, person);
        request.getSession().setAttribute(Constants.SESSIONTHISUSERNAME, person.getFullname());

        ModelAndView view = new ModelAndView("redirect:/index.html");
        return view;
    }

    @RequestMapping(value = "login/loginOut.html", method = {
            RequestMethod.POST, RequestMethod.GET
    })
    public ModelAndView loginOut(HttpServletRequest request, Model model) throws BaseAppException {
        HttpSession session = request.getSession(true);
        logger.debug("用户退出:user_name=" + session.getAttribute(Constants.SESSIONTHISUSERNAME));
        session.removeAttribute(Constants.SESSIONUSER);
        session.removeAttribute(Constants.SESSIONTHISUSERNAME);
        ModelAndView view = new ModelAndView("redirect:/");
        return view;
    }
}
