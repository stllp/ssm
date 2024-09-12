package com.lvlp.stu.quick.config;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

/**
 * @Author : 吕良平
 * @Date: 2024-09-12 12:55
 * @Description:
 */
@Component
@Data
@ConfigurationProperties(prefix = "spring.jdbc.datasource") //使用此注解 则 不需要再写入@Value注解
public class DatasourceConfigurationProperties {
    private String driverClassName;
    private String url;
    private String username;
    private String password;
}
