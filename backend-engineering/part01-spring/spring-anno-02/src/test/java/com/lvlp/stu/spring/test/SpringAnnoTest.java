package com.lvlp.stu.spring.test;

import com.lvlp.stu.spring.anno.config.ConfigProperties;
import com.lvlp.stu.spring.anno.controller.UserController;
import com.lvlp.stu.spring.anno.dao.UserDao;
import com.lvlp.stu.spring.anno.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @Author lvlp
 * @create 2024/8/28 23:43
 */
public class SpringAnnoTest {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-anno.xml");


        UserController userController = ioc.getBean("userController", UserController.class);
        System.out.println(userController);
        userController.showList();

//        UserService userService = ioc.getBean("userServiceImpl", UserService.class);
//        System.out.println(userService);
//        userService.showList();
//
//        UserDao userDao = ioc.getBean("userDaoImpl", UserDao.class);
//        System.out.println(userDao);
        //userDao.showAll();
    }
    @Test
    public void test1() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring-anno.xml");


        ConfigProperties configProperties = ioc.getBean("configProperties", ConfigProperties.class);
        System.out.println(configProperties.toString());

    }
}
