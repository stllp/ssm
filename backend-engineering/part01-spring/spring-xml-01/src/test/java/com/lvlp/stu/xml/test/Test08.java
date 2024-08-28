package com.lvlp.stu.xml.test;

import com.lvlp.stu.xml.pojo.HappyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test08 {
    @Test
    public void test() {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring08.xml");

        HappyComponent h1 = ioc.getBean("h1", HappyComponent.class);
        HappyComponent h2 = ioc.getBean("h1", HappyComponent.class);
        //默认单例模式  scope 属性 确认单例 还是多例
        //<bean id="h1" class="com.lvlp.stu.xml.pojo.HappyComponent" scope="singleton">
        //<bean id="h1" class="com.lvlp.stu.xml.pojo.HappyComponent" scope="prototype">
        //scope="prototype"  则变为多例
        System.out.println(h1 == h2);
    }
}
