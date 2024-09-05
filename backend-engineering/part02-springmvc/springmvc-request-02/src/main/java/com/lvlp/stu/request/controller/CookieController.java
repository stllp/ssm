package com.lvlp.stu.request.controller;

import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.CookieValue;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : 吕良平
 * @Date: 2024-09-05 9:47
 * @Description:
 */

/**
 * cookie 是一种数据保存技术，保存在客户端
 * 后端创建cookie,响应给前端。前端后续每次请求，都会携带cookie数据给后端
 * 以后再springMVC中回去cookie的值时，可以直接使用注解,指定名称，进行获取
 */
@Controller
@RequestMapping("/cookie")
public class CookieController {
    @GetMapping("/getCookie")
    @ResponseBody
    public String getCookie(@CookieValue("JSESSIONID") String sessionId) {
        System.out.println("sessionId = " + sessionId);
        return "getCookie ok";
    }
    @GetMapping("/setCookie")
    @ResponseBody
    public String setCookie(HttpSession session) {
        System.out.println("session.getid()" + session.getId());
        return "setCookie ok";
    }
}
