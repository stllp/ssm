package com.lvlp.stu.xml.test;

import com.lvlp.stu.xml.pojo.HappyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test01 {
    @Test
    public void test() {
        //基于 是pringxml文件 创建IOC 容器
        ClassPathXmlApplicationContext ioc
                = new ClassPathXmlApplicationContext("spring01.xml");
        /**
         * 根据IOC 获取对象
         * 1、根据ID获取bean对象 好处 简单唯一  坏处 需要强转
         */
//        Demo01 bean = (Demo01) ioc.getBean("h1");
        //2、根据class 获取对象   好处 不用强转  坏处：有多个class 相同时 会报错 NoUniqueBeanDefinitionException
//        Demo01 bean = ioc.getBean(Demo01.class);
        //3、根据 id 和 class 获取  学习阶段最常用
        HappyComponent bean = ioc.getBean("h1", HappyComponent.class);
        //使用对象
        bean.doWork();
    }
}
