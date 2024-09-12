package com.lvlp.stu.quick;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * @Author : 吕良平
 * @Date: 2024-09-12 11:44
 * @Description:
 */
@SpringBootApplication
public class Application {
    public static void main(String[] args) {
        var ioc = SpringApplication.run(Application.class, args);
        String[] beanDefinitionNames = ioc.getBeanDefinitionNames();

//        for (String beanDefinitionName : beanDefinitionNames) {
//            System.out.println(beanDefinitionName);
//        }
    }
}
