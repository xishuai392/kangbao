/**
 * 
 */
package cn.kangbao.webapp.web.controller;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kangbao.common.util.Constants;

/** 
 * <Description> <br> 
 *  
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年7月17日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.webapp.web.controller <br>
 */
@Controller
public class NewsController extends AbstractBaseController {
    
    @RequestMapping(value = "/news_index.html")
    public String index(HttpServletRequest request, Model model) {
        return "news/news_index";
    }
}
