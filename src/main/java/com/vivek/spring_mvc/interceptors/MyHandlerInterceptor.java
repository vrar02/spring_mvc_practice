package com.vivek.spring_mvc.interceptors;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class MyHandlerInterceptor extends HandlerInterceptorAdapter {

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        System.out.println("in prehandle..you can perform wrapping the request or filter the request parameters before sending to controller");

        if(!request.getParameter("email").contains("@gmail.com")){
            System.out.println("use wrapper to modify the request param");
            response.setContentType("text/html");
            response.getWriter().println("<h1>incorrect gmail....check console output also<h1>");
            return false;
        }
        return true;
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {
        System.out.println("have acces to modelandview object to add any extra data to actual view");
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        System.out.println("after view is loaded...before showing to the user");
    }
}
