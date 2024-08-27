package com.lvlp.stu.xml.test;

import com.lvlp.stu.xml.pojo.HappyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test05 {
    @Test
    public void test() {
        //基于 是pringxml文件 创建IOC 容器
        ClassPathXmlApplicationContext ioc
                = new ClassPathXmlApplicationContext("spring05.xml");
        HappyComponent bean = ioc.getBean("HappyComponent", HappyComponent.class);
        System.out.println(bean);

    }
}
