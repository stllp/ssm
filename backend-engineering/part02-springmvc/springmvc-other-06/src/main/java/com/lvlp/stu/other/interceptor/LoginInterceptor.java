package com.lvlp.stu.other.interceptor;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.web.servlet.HandlerInterceptor;

/**
 * @Author : 吕良平
 * @Date: 2024-09-06 15:05
 * @Description:
 */
public class LoginInterceptor implements HandlerInterceptor {
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        HttpSession session = request.getSession();
        Object username = session.getAttribute("username");
        if (username == null) {
            System.out.println("preHandle 执行校验失败了");
            return false;
        }
        System.out.println("preHandle 执行校验通过了");
        return true;
    }
}
