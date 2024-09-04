package com.lvlp.stu.request.controller;

import com.lvlp.stu.request.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-04 17:22
 * @Description:
 */

/**
 * 接收param参数
 * 写法1：直接接收
 * 前端发送的参数名和映射的方法的形参名一致，即可完成接收
 * username=azhen->request.getparameter("username");->(String username)
 * 没传参或参数名不一致时，默认赋值null，简化了类型转换
 * 写法2：@RequestParam(value="参数名"，required="是否为必传"，defaultValue="不传参的默认值")
 * 1、前后端参数不一致时，可以进行指定映射。
 * 2、参数是否必传
 * 3、当不传递时，可以设置默认值
 * 如果必传，前段没有传的情况下，会报400错误，必要的参数未提供
 * 写法3：一名多值： http://localhost:8080/list?hobbies=sing&hobbies=jump&hobbies=rap&hobbies=blueball
 * 前段请求的参数时相同的key，后端接收要用List.RequestParam注解
 * 写法4：实体入参
 * 前端请求的参数和后端接收的类型的属性一致
 */
@Controller
@RequestMapping("/param")
public class ParamController {
    @GetMapping("/data")
    @ResponseBody
    public String data(String username, String gender, Integer age) {
        System.out.println("username = " + username + ", gender = " + gender + ", age = " + age);
        return "data ok";
    }

    @GetMapping("/regData")
    @ResponseBody
    public String reqData(@RequestParam(value = "userName", required = false, defaultValue = "用户小可爱") String username, String gender, Integer age) {
        System.out.println("username = " + username + ", gender = " + gender + ", age = " + age);
        return "reqData ok";
    }

    @GetMapping("/list")
    @ResponseBody
    public String reqList(@RequestParam("hobbies") List<String> hobbies) {
        hobbies.forEach(System.out::println);
        return "reqList ok";
    }

    @GetMapping("/pojo")
    @ResponseBody
    public String pojo(User user) {
        System.out.println("user = " + user);
        return "reqpojo ok";
    }
}
