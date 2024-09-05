package com.lvlp.stu.request.controller;

import com.lvlp.stu.request.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : 吕良平
 * @Date: 2024-09-05 9:33
 * @Description:
 */

/**
 * 1、导入jackson-databind依赖
 * 2、在mvc配置文件中,加入<mvc:annotation-driven/> 注意 结尾是mvc
 * 3、使用注解 @RequestBody
 */
@Controller
@RequestMapping("/json")
public class JsonController {
    @PostMapping("/user")
    @ResponseBody
    public User getUser(@RequestBody User user) {
        System.out.println("user = " + user);
        return new User("azhen", 18, 10);
    }
}
