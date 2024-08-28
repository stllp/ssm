package com.lvlp.stu.spring.anno.controller;

import com.lvlp.stu.spring.anno.pojo.User;
import com.lvlp.stu.spring.anno.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class UserController {
    private UserService userService;
    public void setUserService(UserService userService) {
        this.userService = userService;
    }
    public  List<User> showList(){
        System.out.println("UserController 的 showList 方法被执行了");
        return  userService.showList();
    }


}
