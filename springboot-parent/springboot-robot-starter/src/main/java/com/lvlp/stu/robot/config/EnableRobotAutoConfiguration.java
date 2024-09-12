package com.lvlp.stu.robot.config;

import org.springframework.context.annotation.Import;

import java.lang.annotation.*;

/**
 * @Author : 吕良平
 * @Date: 2024-09-12 17:29
 * @Description:
 */

@Target({ElementType.TYPE})
@Retention(RetentionPolicy.RUNTIME)
@Documented
@Import(RobotAutoConfiguration.class)
public @interface EnableRobotAutoConfiguration {
}
