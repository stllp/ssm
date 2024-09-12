package com.lvlp.stu.quick.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : 吕良平
 * @Date: 2024-09-12 11:52
 * @Description:
 */
@RestController
public class HelloController {
    @GetMapping("/hello")
    public String hello() {
        return "hello ok";
    }

}
