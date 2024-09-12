package com.lvlp.stu.robot.config;

import com.lvlp.stu.robot.properties.RobotProperties;
import com.lvlp.stu.robot.service.RobotService;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * @Author : 吕良平
 * @Date: 2024-09-12 17:20
 * @Description:
 */
@Configuration
@Import({RobotService.class, RobotProperties.class})
public class RobotAutoConfiguration {

}
