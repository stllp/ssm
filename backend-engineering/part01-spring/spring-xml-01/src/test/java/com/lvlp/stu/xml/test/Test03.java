package com.lvlp.stu.xml.test;

import com.lvlp.stu.xml.pojo.HappyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test03 {
    @Test
    public void test() {
        //基于 是pringxml文件 创建IOC 容器
        ClassPathXmlApplicationContext ioc
                = new ClassPathXmlApplicationContext("spring03.xml");
        HappyComponent bean = ioc.getBean("hpp", HappyComponent.class);
        //使用对象
        bean.doWork();

        System.out.println("HappyComponent 的 componentName ="+bean.getComponentName());
        System.out.println("HappyComponent 的 happyMachine ="+bean.getHappyMachine());
    }
}
