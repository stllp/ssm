package com.lvlp.stu.request.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * @Author : 吕良平
 * @Date: 2024-09-04 12:51
 * @Description:
 */

/**
 * @RequestMapping("/user/register") 注解作用：请求映射的路径，将路径写入HandlerMapping 里面 方便DispatcherServlet查找
 * 写法1：精确匹配
 * 单层路径：/register
 * 多层路径：/user/register
 * 多个路径:{"/user/register","/user/reg"}
 * 注意：开头的/可以省略 spring会自动补齐，中间的/不能省略
 * 写法2：模糊匹配
 * 模糊匹配单层：/user/*
 * 模糊匹配多层：/user/**
 * 模糊匹配指定层：/user//*//*  不向下兼容
 * 注音:模糊匹配不会影响精确匹配，相对满足和绝对满足
 * 写法3：类和方法上
   1、类上：@RequestMapping 对类的方法统一加上了前缀
   2、方法上：将请求映射到方法上，执行代码
 * 写法4：限制请求方式
 * 默认支持所有的请求格式
 * 可以通过method属性进行设置,赋值是RequestMethod枚举类
 * 如果请求方式不匹配：http状态405
 * 写法5：请求进阶
 * 当我们非常明确一个方法需要什么请求时，可以直接使用一下注解
 * postMapping
 * getMapping
 * PutMapping
 * DeleteMapping
 * 注意：
 * 1、路径不可重复映射
 * 2.一个方法只能有一个@RequestMapping 注解
 */




@Controller
@RequestMapping("/user")
public class UserController {
    //    @RequestMapping(value = {"/register", "/reg"}, method = RequestMethod.POST)
    @PostMapping({"/register", "/reg"})
    @ResponseBody
    public String register() {
        return "register ok";
    }

    @RequestMapping(value = {"/exit"}, method = {RequestMethod.GET, RequestMethod.POST})
    @ResponseBody
    public String exit() {
        return "exit ok";
    }

    @RequestMapping(value = {"/login"}, method = RequestMethod.POST)
    @ResponseBody
    public String login() {
        return "login ok";
    }
}
