/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import java.util.Date;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import cn.kangbao.common.exception.BaseAppException;
import cn.kangbao.common.log.LoggerManager;
import cn.kangbao.common.util.BeanUtils;
import cn.kangbao.webapp.db.appmgr.entity.Person;
import cn.kangbao.webapp.db.appmgr.entity.SysUser;
import cn.kangbao.webapp.web.service.RegisterService;
import cn.kangbao.webapp.web.vo.RegisterVO;

/**
 * <Description> <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年9月16日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.controller <br>
 */
@Controller
public class RegisterController extends AbstractBaseController {
    LoggerManager logger = LoggerManager.getLogger(RegisterController.class);

    @Autowired
    private RegisterService registerService;

    @RequestMapping(value = "/register.html")
    public ModelAndView index(ModelAndView mav) {
        mav.setViewName("register/register");

        return mav;
    }

    @RequestMapping(value = "/register/addRecord.json")
    @ResponseBody
    public Map addRecord(RegisterVO operateVO) throws BaseAppException {
        logger.debug(operateVO.toString());

        SysUser operateDTO = new SysUser();
        BeanUtils.copyProperties(operateVO, operateDTO);

        // 设置初始值
        operateDTO.setUserid(getPkSequence(IWebConstans.SYS_USER));
        operateDTO.setRegistertime(new Date());
        operateDTO.setCreatetime(new Date());
        operateDTO.setDr(IWebConstans.FIELD_DR_ACTVED);
        operateDTO.setState(IWebConstans.USERSTATE_CREATED);
        operateDTO.setUsertype(IWebConstans.USERTYPE_PATIENT);

        Person person = new Person();
        BeanUtils.copyProperties(operateDTO, person);
        person.setPersonid(getPkSequence(IWebConstans.PERSON));
        person.setFullname(operateDTO.getUsername());
        // person.setMainpersonid(null);

        boolean isOperateDone = registerService.insertUserAndPerson(operateDTO,
                person);

        return getResultMap();
    }
}
