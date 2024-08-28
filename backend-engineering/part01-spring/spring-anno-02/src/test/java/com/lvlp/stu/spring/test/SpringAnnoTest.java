package com.lvlp.stu.spring.test;

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
        UserDao userDao = ioc.getBean("userDaoImpl", UserDao.class);
        userDao.showAll();
        UserService userService = ioc.getBean("userServiceImpl", UserService.class);
        userService.showList();
        UserController userController = ioc.getBean("userController", UserController.class);
        userController.showList();
    }
}
