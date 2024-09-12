package com.lvlp.stu.robot.properties;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author : 吕良平
 * @Date: 2024-09-12 17:11
 * @Description:
 */
@Component
@Data
@ConfigurationProperties(prefix = "robot")
public class RobotProperties {
    private String name;
    private String age;
    private String email;
}
