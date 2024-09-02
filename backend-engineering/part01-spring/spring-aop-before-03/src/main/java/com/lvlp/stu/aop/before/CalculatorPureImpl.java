package com.lvlp.stu.aop.before;

/**
 * @Author : 吕良平
 * @Date: 2024-09-02 10:24
 * @Description:
 */
public class CalculatorPureImpl implements Calculator{
    @Override
    public int add(int x, int y) {
        return x+y;
    }

    @Override
    public int sub(int x, int y) {
        return x - y;
    }

    @Override
    public int mul(int x, int y) {
        return x*y;
    }

    @Override
    public int div(int x, int y) {
        return x/y;
    }
}
