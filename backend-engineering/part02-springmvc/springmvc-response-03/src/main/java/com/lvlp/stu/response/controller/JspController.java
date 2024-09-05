package com.lvlp.stu.response.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @Author : 吕良平
 * @Date: 2024-09-05 10:30
 * @Description:
 */

/**
 * 当没有@ResponseBody 注解时，返回的字符串会走视图解析器
 * 物理视图= 前缀+ 逻辑视图名 + 后缀  /WEB-INF/views/index.jsp
 */
@Controller
@RequestMapping("/jsp")
public class JspController {
    @GetMapping("/toindex")
    public String toindex(Model model) {
        model.addAttribute("msg", "于姓某人减肥，半夜怒吃十斤烤串，炸鸡。");
        return "index";
    }

    @GetMapping("/jump")
    public String jump(Model model) {
        model.addAttribute("msg", "某人和一女士深夜走了出去………… 看了一场电影");
        //forward: 转发标识
        // return "forward:/jsp/forward"; 转发  可以传递数据
        // redirect: 重定向标识
        return "redirect:/jsp/redirect"; //重定向 不能传递数据
    }

    @GetMapping("/forward")
    public String forward() {
        System.out.println("嘿嘿嘿");
        return "forward";
    }

    @GetMapping("/redirect")
    public String redirect() {
        System.out.println("哈哈哈");
        return "redirect";
    }

}
