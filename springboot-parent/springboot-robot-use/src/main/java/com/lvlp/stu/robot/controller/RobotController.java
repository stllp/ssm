package com.lvlp.stu.robot.controller;

import com.lvlp.stu.robot.properties.RobotProperties;
import com.lvlp.stu.robot.service.RobotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : 吕良平
 * @Date: 2024-09-12 17:34
 * @Description:
 */
@RestController
@RequestMapping("/robot")
public class RobotController {
    @Autowired
    private RobotService robotService;
    @GetMapping
    public String sayHi() {
        return robotService.sayHello();
    }
}
