package com.lvlp.stu.quick.config;

import org.springframework.beans.factory.annotation.Value;

/**
 * @Author : 吕良平
 * @Date: 2024-09-12 12:36
 * @Description:
 */
//@Component
//@Data
public class DatasourceProperties {
    @Value("${spring.jdbc.datasource.driverClassName}")
    private String driverClassName;
    @Value("${spring.jdbc.datasource.url}")
    private String url;
    @Value("${spring.jdbc.datasource.username}")
    private String username;
    @Value("${spring.jdbc.datasource.password}")
    private String password;
}
