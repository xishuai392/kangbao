/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.webapp.db.appmgr.entity.Person;
import cn.kangbao.webapp.db.appmgr.entity.SysUser;
import cn.kangbao.webapp.web.service.ILoginService;
import cn.kangbao.webapp.web.service.PersonService;

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

    @Autowired
    private ILoginService loginService;

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "login/login.html")
    public String login() {

        return "login";
    }

    // @RequestMapping(value = "login/loginCheck.html", method = RequestMethod.POST, produces = "application/json;charset=utf-8")
    @RequestMapping(value = "login/loginCheck.json", method = RequestMethod.POST)
    public @ResponseBody Map loginCheck(SysUser sysUser) {
        // 验证用户账号与密码是否正确
        SysUser newSysUser = null;
        Map resultMap = null;
        HttpServletRequest request = getRequest();
        try {
            newSysUser = loginService.userLogin(sysUser.getUsername(), sysUser.getPassword());
        }
        catch (BaseAppException e) {
            resultMap = getResultMap(false, "登录失败！" + e.getMessage(), null);
        }
        if (null == newSysUser) {
            resultMap = getResultMap(false, "登录失败！<br>用户名或密码不正确，请重试!<br>如果您的密码丢失或遗忘，请点击 找回密码。", null);
        }

        if (null != resultMap) {
            return resultMap;
        }

        List<Person> personList = personService.getPersonByUserId(newSysUser.getUserid());
        Person mainPerson = null;
        for (Person p : personList) {
            if (null == p.getMainpersonid()) {
                // 户主ID为空，代表就是户主
                mainPerson = p;
                break;
            }

        }

        request.getSession().setAttribute(IWebConstans.SESSIONUSER, newSysUser);
        request.getSession().setAttribute(IWebConstans.SESSIONMAINPERSON, mainPerson);
        request.getSession().setAttribute(IWebConstans.SESSIONTHISMAINUSERNAME, mainPerson == null ? null : mainPerson.getFullname());

        return getResultMap("登录成功！");
    }

    @RequestMapping(value = "login/loginout.html", method = {
            RequestMethod.POST, RequestMethod.GET
    })
    public ModelAndView loginOut(HttpServletRequest request, Model model) throws BaseAppException {
        HttpSession session = request.getSession(true);
        logger.debug("用户退出:user_name=" + session.getAttribute(IWebConstans.SESSIONTHISMAINUSERNAME));
        session.removeAttribute(IWebConstans.SESSIONUSER);
        session.removeAttribute(IWebConstans.SESSIONMAINPERSON);
        session.removeAttribute(IWebConstans.SESSIONTHISMAINUSERNAME);
        ModelAndView view = new ModelAndView("redirect:/");
        return view;
    }
}
