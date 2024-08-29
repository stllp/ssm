package com.lvlp.stu.spring.allanno.controller;

import com.lvlp.stu.spring.allanno.pojo.User;
import com.lvlp.stu.spring.allanno.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

//@Component
//@Controller("userC") 自定义ID名称  默认是类名 首字母小写
@Controller
public class UserController {
    @Autowired(required = false) //放在属性上  使用反射注入  一般写在属性上
    private UserService userService;


//    @Autowired 可以写在set 方法上
//    public UserController(UserService userService) {
//        this.userService = userService;
//    }
//    @Autowired 可以写在构造方法上
//    public void setUserService(UserService userService) {
//        this.userService = userService;
//    }

    public List<User> showList() {
        System.out.println("UserController 的 showList 方法被执行了");
        return userService.showList();
    }


}
