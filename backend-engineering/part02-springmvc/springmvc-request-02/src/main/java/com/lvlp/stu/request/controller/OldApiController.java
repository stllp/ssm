package com.lvlp.stu.request.controller;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.IOException;

/**
 * @Author : 吕良平
 * @Date: 2024-09-05 10:06
 * @Description:
 */
@Controller
@RequestMapping("/old")
public class OldApiController {
    @GetMapping("/data")
    @ResponseBody
    public void getData(HttpServletRequest request, HttpServletResponse response, HttpSession session) throws IOException {
        String name = request.getParameter("name");
        Integer age = Integer.valueOf(request.getParameter("age"));
        Double score = Double.valueOf(request.getParameter("score"));
        System.out.println("name=" + name + "  age=" + age + "  score=" + score);
        session.setAttribute("aa", "11111");
        response.getWriter().print("getData ok");
    }
}
