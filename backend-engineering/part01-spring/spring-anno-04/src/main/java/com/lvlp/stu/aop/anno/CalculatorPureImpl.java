package com.lvlp.stu.aop.anno;

import org.springframework.stereotype.Component;

/**
 * @Author : 吕良平
 * @Date: 2024-09-02 10:24
 * @Description:
 */
@Component
public class CalculatorPureImpl implements Calculator {
    @Override
    public int add(int x, int y) {
        return x + y;
    }

    @Override
    public int sub(int x, int y) {
        return x - y;
    }

    @Override
    public int mul(int x, int y) {
        return x * y;
    }

    @Override
    public int div(int x, int y) {
//        System.out.println("divfan功法开始前");
        int result = x / y;
//        System.out.println("divfan功法结束前");
        return result;
    }
}
