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
import org.springframework.util.Assert;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import cn.kangbao.common.exception.BaseAppException;
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

    @RequestMapping(value = "/index.html")
    public String index(Model model) {
        SysUser newSysUser = getSessionSysUser();
        List<Person> pList = personService.getPersonByUserId(newSysUser.getUserid());
        // getRequest().setAttribute("pList", pList);
        model.addAttribute("pList", pList);
        return "main/person";
    }

    @RequestMapping(value = "/jumpToModify.html")
    public String jumpToModify(@RequestParam("personId") int personId, Model model) throws BaseAppException {
        Person person = personService.selectByPersonId(personId);
        if (null == person) {
            throw new BaseAppException("查询不到该成员！");
        }
        
        model.addAttribute("thisPerson", person);
        
        return "main/person_operate";
    }
}
