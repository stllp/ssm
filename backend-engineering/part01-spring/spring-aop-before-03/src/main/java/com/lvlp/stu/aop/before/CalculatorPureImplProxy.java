package com.lvlp.stu.aop.before;

/**
 * @Author : 吕良平
 * @Date: 2024-09-02 10:27
 * @Description: 静态代理 在每个方法上面写静态死代码
 */
public class CalculatorPureImplProxy implements Calculator {
    private Calculator calculator;

    public CalculatorPureImplProxy(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int add(int x, int y) {
//        System.out.println("add 方法执行了：入参= " + x + "," + y);
        LogUtil.before("add", x, y);
        int result = calculator.add(x, y);
//        System.out.println("add 方法执行了：出参= " + result);
        LogUtil.after("add", result);
        return result;
    }

    @Override
    public int sub(int x, int y) {
        return 0;
    }

    @Override
    public int mul(int x, int y) {
        return 0;
    }

    @Override
    public int div(int x, int y) {
        return 0;
    }
}
