/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import org.springframework.http.HttpRequest;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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

public class LoginController extends AbstractBaseController {

    @RequestMapping(value = "login/loginCheck", method = RequestMethod.POST)
    public ModelAndView loginCheck(HttpRequest request, SysUser sysUser) {
        // 验证用户账号与密码是否正确
        SysUser appUser = new SysUser();
        appUser.setUserid(1);
        appUser.setUsername("admin");
        appUser.setPassword("1");

        Person person = new Person();
        person.setUserid(1);
        person.setPersonid(1);
        person.setFullname("超级管理员");
        
        ModelAndView view = new ModelAndView("redirect:/index.do");
        return view;
    }
}
