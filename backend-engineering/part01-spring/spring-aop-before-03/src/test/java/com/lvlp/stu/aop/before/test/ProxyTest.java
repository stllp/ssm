package com.lvlp.stu.aop.before.test;

import com.lvlp.stu.aop.before.Calculator;
import com.lvlp.stu.aop.before.CalculatorPureImpl;
import com.lvlp.stu.aop.before.CalculatorPureImplProxy;
import com.lvlp.stu.aop.before.ProxyFactory;
import org.junit.jupiter.api.Test;

/**
 * @Author : 吕良平
 * @Date: 2024-09-02 10:29
 * @Description:
 */
public class ProxyTest {
    @Test
    public void test() {
        //创建目标对象
        CalculatorPureImpl calculatorPure = new CalculatorPureImpl();
        //创建代理对象
        CalculatorPureImplProxy calculatorPureImplProxy = new CalculatorPureImplProxy(calculatorPure);

        calculatorPureImplProxy.add(3, 5);
    }

    @Test
    public void test1() {
        //1 创建 目标对象
        CalculatorPureImpl calculatorPure = new CalculatorPureImpl();
        //创建动态代理工厂对象
        ProxyFactory<CalculatorPureImpl> proxyFactory = new ProxyFactory<>(calculatorPure);
        //获取代理对象
        Calculator proxy = proxyFactory.getProxy();

        proxy.add(3, 5);

        proxy.sub(3, 5);

        proxy.mul(3, 5);

        proxy.div(3, 5);
    }
}

