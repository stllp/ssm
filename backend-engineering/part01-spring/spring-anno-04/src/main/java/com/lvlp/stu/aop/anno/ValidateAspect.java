package com.lvlp.stu.aop.anno;

import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

/**
 * @Author : 吕良平
 * @Date: 2024-09-02 15:00
 * @Description:
 */
@Aspect
@Component
@Order(1) // 默认按名称排序  @Order 可自定义排序 数字越小 优先级越高
public class ValidateAspect {
    //pointCut  可以跨类使用
    @Before("com.lvlp.stu.aop.anno.LogAspect.pointCut()")
    public void validateBefore() {
        System.out.println("validateBefore执行了");
    }
}
