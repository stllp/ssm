package com.lvlp.stu.aop.anno;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * @Author : 吕良平
 * @Date: 2024-09-02 11:50
 * @Description:
 */
@Configuration
@ComponentScan("com.lvlp.stu.aop")
@EnableAspectJAutoProxy //配置文件写法 <aop:aspectj-outoproxy
public class SpringConfig {
}
