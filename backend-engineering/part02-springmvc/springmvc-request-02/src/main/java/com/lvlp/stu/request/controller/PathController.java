package com.lvlp.stu.request.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author lvlp
 * @create 2024/9/4 23:58
 */

/**
 * param传参:http:/localhost:8080/user/lohin?name=zhangsan&pwd=123
 * 路径传参:http:/localhost:8080/user/lohin/zhangsan/123
 */
@Controller
@RequestMapping("/path")
public class PathController {
    @GetMapping("/{id}")
    public String showUserById(@PathVariable("id") Integer id) {
        System.out.println("id = " + id);
        return "showUserById ok";
    }
}
