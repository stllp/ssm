package com.lvlp.stu.response.controller;

import com.lvlp.stu.response.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

/**
 * @Author : 吕良平
 * @Date: 2024-09-05 11:22
 * @Description:
 */

/**
 *@RequestBody + jackson = 接收jison
 *@ResponseBody + jackson = 返回json
 *
 */
//@Controller
@RestController //相当于 @Controller  和  @ResponseBody 在类上表示所有的方法都要使用@ResponseBody
@RequestMapping("/json")
public class JsonController {
    @PostMapping("/user")
//    @ResponseBody
    public User getUser(@RequestBody User user) {
        System.out.println("user = " + user);
        return new User("花花", "女", 88);
    }

}
