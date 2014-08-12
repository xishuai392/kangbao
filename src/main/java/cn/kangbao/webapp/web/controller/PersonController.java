/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.webapp.db.appmgr.entity.Person;
import cn.kangbao.webapp.db.appmgr.entity.SysUser;
import cn.kangbao.webapp.web.service.PersonService;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年8月8日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.controller <br>
 */
@Controller
@RequestMapping("/person")
public class PersonController extends AbstractBaseController {

    LoggerManager logger = LoggerManager.getLogger(PersonController.class);

    @Autowired
    private PersonService personService;

    @RequestMapping(value = "/addRecord.html")
    public String index() {
        SysUser newSysUser = getSessionSysUser();
        List<Person> pList = personService.getPersonByUserId(newSysUser.getUserid());
        getRequest().setAttribute("pList", pList);
        return "main/person";
    }
}
