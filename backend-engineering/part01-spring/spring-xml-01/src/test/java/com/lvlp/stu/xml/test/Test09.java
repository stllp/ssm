package com.lvlp.stu.xml.test;

import com.lvlp.stu.xml.pojo.User;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test09 {
    @Test
    public void test() {
        /*bean 生命周期
        <!--    init 针对 单独的bean-->
        <bean id="user" class="com.lvlp.stu.xml.pojo.User" init-method="init" destroy-method="destroy">
        </bean>
        <!--   MyBeanPostProcessor 后置处理器 针对所有的bean -->
        <bean id = "myBeanPostProcessor" class="com.lvlp.stu.xml.processor.MyBeanPostProcessor" ></bean >*/
        //ctrl + h 查看对象的 子类
//        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring09.xml");
        ConfigurableApplicationContext ioc = new ClassPathXmlApplicationContext("spring09.xml");

        User user = ioc.getBean("user", User.class);
        //<bean id="user" class="com.lvlp.stu.xml.pojo.User" init-method="init" destroy-method="destroy">
        System.out.println(user);

        ioc.close();

    }
}
