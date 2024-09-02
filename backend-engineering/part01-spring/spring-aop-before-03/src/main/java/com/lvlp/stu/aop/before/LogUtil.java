package com.lvlp.stu.aop.before;

import java.util.Arrays;

/**
 * @Author : 吕良平
 * @Date: 2024-09-02 10:28
 * @Description:
 */
public class LogUtil {

    public static void before(String method, Object... args) {
        System.out.println(method + "方法执行了，入参:" + Arrays.toString(args));
    }

    public static void after(String method, Object result) {
        System.out.println(method + "方法执行了完毕了，出参:" + result);
    }
}
