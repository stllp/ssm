package com.lvlp.stu.request.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : 吕良平
 * @Date: 2024-09-05 9:57
 * @Description:
 */
@Controller
@RequestMapping("/header")
public class HeaderController {

    @GetMapping("/accept")
    @ResponseBody
    public String getAccept(@RequestHeader("Accept") String accept) {
        System.out.println("accept = " + accept);
        return "getAccept ok";
    }
}
