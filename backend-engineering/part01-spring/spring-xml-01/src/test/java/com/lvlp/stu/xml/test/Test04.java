package com.lvlp.stu.xml.test;

import com.lvlp.stu.xml.pojo.HappyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test04 {
    @Test
    public void test() {
        //基于 是pringxml文件 创建IOC 容器
        ClassPathXmlApplicationContext ioc
                = new ClassPathXmlApplicationContext("spring04.xml");
        HappyComponent bean = ioc.getBean("hpp1", HappyComponent.class);
        System.out.println("HappyComponent 的 componentName =" + bean.getComponentName());
        System.out.println("HappyComponent 的 happyMachine =" + bean.getHappyMachine());
        bean.getHappyMachine().setMachineName("小艺小艺");
        System.out.println("HappyComponent 的 componentName =" + bean.getComponentName());
        System.out.println("HappyComponent 的 happyMachine =" + bean.getHappyMachine());
        HappyComponent bean1 = ioc.getBean("hpp2", HappyComponent.class);
        System.out.println("HappyComponent 的 componentName =" + bean1.getComponentName());
        System.out.println("HappyComponent 的 happyMachine =" + bean1.getHappyMachine());
    }
}
