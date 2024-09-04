package com.lvlp.stu.request.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : 吕良平
 * @Date: 2024-09-04 17:22
 * @Description:
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    @GetMapping("/data")
    @ResponseBody
    public String data( String username , String gender , Integer age){
        System.out.println("username = " + username + ", gender = " + gender + ", age = " + age);
        return "data ok";
    }
}
