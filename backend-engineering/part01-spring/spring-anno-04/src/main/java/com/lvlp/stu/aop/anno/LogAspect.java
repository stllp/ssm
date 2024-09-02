package com.lvlp.stu.aop.anno;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * @Author : 吕良平
 * @Date: 2024-09-02 11:35
 * @Description:
 */
@Aspect //切面类 ：存放的是额外的代码   通知 及 增强
@Component
@Order(2) // 默认按名称排序  @Order 可自定义排序 数字越小 优先级越高
public class LogAspect {
    //该类不是代理类  只是存放了非核心代码的类


    //范围提取到统一的 pointCut 函数注解上
    @Pointcut("execution(* *..*(..))") //切入点
    public void pointCut() {
    }
    //方法执行前 执行该方法
    /**
     * 1、切入点   @Pointcut("execution(* *..*(..))") //切入点 @Before("pointCut()") 等
     * 2、连接点   JoinPoint
     */
    /**
     * 方法执行前 执行该方法
     */
    //@Before("execution(public int com.lvlp.stu.aop.anno.CalculatorPureImpl.div(int,int))") //切入点
//    @Before("pointCut()") //简写  任意 类任意方法
    public void beforeAdvice(JoinPoint joinPoint) {
        //joinPoint 代表的是切入的方法
        String name = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("日志功能：" + name + "方法执行了，入参：" + Arrays.toString(args));
    }

    //方法执行后  无论是否有异常  都会执行该方法
    //@After(value = "execution(public int com.lvlp.stu.aop.anno.CalculatorPureImpl.div(int,int))")//切入点
//    @After("pointCut()") //简写  任意 类任意方法
    public void afterAdvice(JoinPoint joinPoint) {
        String name = joinPoint.getSignature().getName();
        System.out.println("日志功能：" + name + "方法执行结束了");
    }

    //方法执行后  正确返回结果 执行该通知
//    @AfterReturning(value = "pointCut()"
//            , returning = "result")
    public void afterReturning(JoinPoint joinPoint, Object result) {
        String name = joinPoint.getSignature().getName();
        System.out.println("日志功能:" + name + "方法执行结束了,出参:" + result);
    }

    //方法执行后  异常返回结果 执行该通知
//    @AfterThrowing(value = "pointCut()"
//            , throwing = "ex")
    public void afterThrowing(JoinPoint joinPoint, Exception ex) {
        String name = joinPoint.getSignature().getName();
        System.out.println("日志功能:" + name + "方法抛出异常,异常:" + ex.getMessage());
    }

    //环绕通知
    @Around(value = "pointCut()") //切入点
    public Object aroundAdvice(ProceedingJoinPoint proceedingJoinPoint) {
        String name = proceedingJoinPoint.getSignature().getName();
        Object[] args = proceedingJoinPoint.getArgs();
        Object result = null;
        try {
            System.out.println("日志功能：" + name + "方法执行了，入参：" + Arrays.toString(args));
            result = proceedingJoinPoint.proceed();
            System.out.println("日志功能:" + name + "方法执行结束了,出参:" + result);
        } catch (Throwable ex) {
//            throw new RuntimeException(ex);
            System.out.println("日志功能:" + name + "方法抛出异常,异常:" + ex.getMessage());

        } finally {
            System.out.println("日志功能：" + name + "方法执行结束了");
            return result;
        }

    }
}
