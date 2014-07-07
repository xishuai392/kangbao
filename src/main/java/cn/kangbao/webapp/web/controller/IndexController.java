/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

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
public class IndexController extends AbstractBaseController {
    @RequestMapping(value = "/index.html")
    public String index(Model model) {
        return "login/main";
    }
}
