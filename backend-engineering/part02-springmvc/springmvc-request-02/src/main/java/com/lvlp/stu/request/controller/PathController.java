package com.lvlp.stu.request.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author lvlp
 * @create 2024/9/4 23:58
 */

/**
 * param传参:http:/localhost:8080/user/lohin?name=zhangsan&pwd=123
 * 路径传参:http:/localhost:8080/user/lohin/zhangsan/123
 *     使用 @PathVariable("id") 注解
 *     引入依赖 jackson-databind
 *     装配jackson
 *     <mvc:annotation-driven/>
 *
 */
@Controller
@RequestMapping("/path")
public class PathController {
    @GetMapping("/{id}")
    @ResponseBody
    public String showUserById(@PathVariable("id") Integer id) {
        System.out.println("id = " + id);
        return "showUserById ok";
    }

    @GetMapping("/{username}/{password}/{age}")
    @ResponseBody
    public String showUserByUser(@PathVariable("username") String username,
                                 @PathVariable("password") String password,
                                 @PathVariable("age") Integer age) {
        System.out.println("username = " + username + ", password = " + password + ", age = " + age);
        return "showUserById ok";
    }
}
