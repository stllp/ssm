package com.lvlp.stu.aop.before;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

/**
 * @Author : 吕良平
 * @Date: 2024-09-02 10:44
 * @Description: 动态代理 通过代理类及反射实现动态
 */
public class ProxyFactory<T> {

    private T target;

    public ProxyFactory(T target) {
        this.target = target;
    }

    public T getProxy() {
        ClassLoader classLoader = target.getClass().getClassLoader();
        Class<?>[] interfaces = target.getClass().getInterfaces();
        T proxy = (T) Proxy.newProxyInstance(classLoader, interfaces, new MyInvocationHandler());
        return proxy;
    }

    public class MyInvocationHandler implements InvocationHandler {

        @Override
        public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
            System.out.println(method.getName() + "方法执行了,入参:" + Arrays.toString(args));
            Object result = method.invoke(target, args);
            System.out.println(method.getName() + "方法执行完毕了,出参:" + result);
            return result;
        }
    }
}
