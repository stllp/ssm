package com.lvlp.stu.robot;

import com.lvlp.stu.robot.config.EnableRobotAutoConfiguration;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Author : 吕良平
 * @Date: 2024-09-12 17:38
 * @Description:
 */
@SpringBootApplication
@EnableRobotAutoConfiguration
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }
}
