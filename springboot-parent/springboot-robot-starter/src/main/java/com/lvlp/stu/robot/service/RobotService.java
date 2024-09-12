package com.lvlp.stu.robot.service;

import com.lvlp.stu.robot.properties.RobotProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : 吕良平
 * @Date: 2024-09-12 17:14
 * @Description:
 */
@Service
public class RobotService {
    @Autowired
    private RobotProperties robotProperties;

    public String sayHello() {
        return "你好,名字[" + robotProperties.getName() + "]年龄[" + robotProperties.getAge() + "]邮箱[" + robotProperties.getEmail() + "]";
    }
}
