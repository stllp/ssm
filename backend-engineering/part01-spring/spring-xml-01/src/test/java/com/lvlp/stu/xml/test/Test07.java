package com.lvlp.stu.xml.test;

import com.lvlp.stu.xml.pojo.HappyMachine;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.Connection;

public class Test07 {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring07.xml");

        Connection connnect = ioc.getBean("connection", Connection.class);

        System.out.println(connnect);

        HappyMachine happyMachine = ioc.getBean("happyMachine", HappyMachine.class);
        System.out.println(happyMachine.getMachineName());
    }
}
