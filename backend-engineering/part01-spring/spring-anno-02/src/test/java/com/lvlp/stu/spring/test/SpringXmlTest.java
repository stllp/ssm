package com.lvlp.stu.spring.test;

import com.lvlp.stu.spring.xml.controller.UserController;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author lvlp
 * @create 2024/8/28 23:43
 */
public class SpringXmlTest {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-xml.xml");
//        UserDao userDao = ioc.getBean("userDao", UserDao.class);
//        userDao.showAll();
//        UserService userService = ioc.getBean("userService", UserService.class);
//        userService.showList();
        UserController userController = ioc.getBean("userController", UserController.class);
        userController.showList();
    }
}
