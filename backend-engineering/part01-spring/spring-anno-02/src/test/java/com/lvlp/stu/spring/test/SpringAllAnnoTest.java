package com.lvlp.stu.spring.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.lvlp.stu.spring.allanno.config.SpringConfig;
import com.lvlp.stu.spring.allanno.controller.UserController;
import com.lvlp.stu.spring.allanno.pojo.HappyComponent;
import com.lvlp.stu.spring.allanno.pojo.Student;
import com.lvlp.stu.spring.allanno.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.sql.SQLException;

/**
 * @Author : 吕良平
 * @Date: 2024-08-29 12:57
 * @Description:
 */
public class SpringAllAnnoTest {
    @Test
    public void test(){
        ApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        UserController userController = ioc.getBean("userController", UserController.class);
        userController.showList();
    }
    @Test
    public void test1() throws SQLException {
        ConfigurableApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        DruidDataSource dataSource = ioc.getBean("d2", DruidDataSource.class);
//        DruidDataSource dataSource = ioc.getBean("dataSource", DruidDataSource.class);
        System.out.println(dataSource.getConnection());
        User user = ioc.getBean("user", User.class);
        System.out.println(user);
        ioc.close();
    }
    @Test
    public void test2() throws SQLException {
        ConfigurableApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        HappyComponent happyComponent = ioc.getBean("happyComponent", HappyComponent.class);
        System.out.println(happyComponent);
        happyComponent.doWork();
        ioc.close();
    }
    @Test
    public void test3() throws SQLException {
        ConfigurableApplicationContext ioc = new AnnotationConfigApplicationContext(SpringConfig.class);
        Student student = ioc.getBean("student", Student.class);
        System.out.println(student);
        ioc.close();
    }
}
