package com.lvlp.stu.request.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : 吕良平
 * @Date: 2024-09-04 12:43
 * @Description:
 */
@Controller
public class HelloController {
    /**
     * @return
     * @RequestMapping("/hello") 注解作用：请求映射的路径
     */
    @RequestMapping("/hello")
    @ResponseBody
    public String hello() {
        System.out.println("hello spring mvc");
        return "hello springmvc";
    }
}
