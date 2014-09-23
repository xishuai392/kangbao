/**
 * 
 */
package cn.kangbao.common.interceptor;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import cn.kangbao.common.exception.SysExceptionCode;
import cn.kangbao.webapp.web.controller.IWebConstans;

/**
 * <Description>session校验拦截器 <br>
 * 
 * @author pan.xiaobo<br>
 * @version 1.0<br>
 * @taskId <br>
 * @CreateDate 2014年9月23日 <br>
 * @since V1.0<br>
 * @see cn.kangbao.common.interceptor <br>
 */

public class SessionUserInterceptor implements HandlerInterceptor {

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.HandlerInterceptor#preHandle(javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse, java.lang.Object)
     */
    @Override
    public boolean preHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler) throws Exception {
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName()
                + ":" + request.getServerPort() + path + "/";
        String remoteAddress = request.getRemoteAddr();
        String servletPath = request.getServletPath();
        String realPath = request.getRealPath("/");
        String remoteUser = request.getRemoteUser();
        String requestURI = request.getRequestURI();
        System.out.println("path:" + path);
        System.out.println("basePath:" + basePath);
        System.out.println("remoteAddr:" + remoteAddress);
        System.out.println("servletPath:" + servletPath);
        System.out.println("realPath:" + realPath);
        System.out.println("remoteUser:" + remoteUser);
        System.out.println("requestURI:" + requestURI);

        HttpSession session = request.getSession();
        if (session.getAttribute(IWebConstans.SESSIONUSER) == null) {
            // Map params = request.getParameterMap();
            // StringBuilder returnUrl = new StringBuilder(request.getRequestURL()
            // .toString());
            //
            // if (!params.isEmpty()) {
            // returnUrl.append("?");
            // }
            //
            // int i = 0;
            // for (Map.Entry entry : params.entrySet()) {
            // String key = (String) entry.getKey();
            // String[] value = (String[]) (String[]) entry.getValue();
            // if (i++ > 0) {
            // returnUrl.append("&");
            // }
            // returnUrl.append(key).append("=").append(value[0]);
            // }
            //
            // response.sendRedirect(new StringBuilder()
            // .append(request.getContextPath()).append("/login/login.html")
            // .append("?returnUrl=")
            // .append(URLEncoder.encode(returnUrl.toString())).toString());

            if (requestURI.endsWith(".html")) {
                response.sendRedirect(new StringBuilder()
                        .append(request.getContextPath())
                        .append("/login/login.html").toString());
            }
            else {
                String responseMsg = "{\"msg\":\"登录超时，请重新登录！\",\"success\":false,\"errCode\":\""
                        + SysExceptionCode.SESSIONTIMEOUT_EXCEPTION + "\"}";
                try {
                    response.setContentType("text/json;charset=utf-8");
                    PrintWriter writer = response.getWriter();
                    writer.write(responseMsg);
                    writer.flush();
                }
                catch (IOException e) {
                    e.printStackTrace();
                }
            }

            return false;
        }

        return true;
    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.HandlerInterceptor#postHandle(javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse, java.lang.Object, org.springframework.web.servlet.ModelAndView)
     */
    @Override
    public void postHandle(HttpServletRequest request,
            HttpServletResponse response, Object handler,
            ModelAndView modelAndView) throws Exception {
        // TODO Auto-generated method stub

    }

    /*
     * (non-Javadoc)
     * @see org.springframework.web.servlet.HandlerInterceptor#afterCompletion(javax.servlet.http.HttpServletRequest,
     * javax.servlet.http.HttpServletResponse, java.lang.Object, java.lang.Exception)
     */
    @Override
    public void afterCompletion(HttpServletRequest request,
            HttpServletResponse response, Object handler, Exception ex)
            throws Exception {
        // TODO Auto-generated method stub

    }

}
