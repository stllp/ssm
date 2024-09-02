package com.lvlp.stu.aop.anno.test;

import com.lvlp.stu.aop.anno.Calculator;
import com.lvlp.stu.aop.anno.CalculatorPureImpl;
import com.lvlp.stu.aop.anno.SpringConfig;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author : 吕良平
 * @Date: 2024-09-02 11:40
 * @Description:
 */
@SpringJUnitConfig(classes = SpringConfig.class)
public class AspectTest {
    @Autowired
    private  Calculator calculator;
    @Test
    public void test() {
        System.out.println(calculator.getClass().getName());
        // 有接口时 走的时 jdk的代理  jdk.proxy2.$Proxy29
        //没有接口时 走的是 cglib的代理
        calculator.div(3, 1);
    }

}
