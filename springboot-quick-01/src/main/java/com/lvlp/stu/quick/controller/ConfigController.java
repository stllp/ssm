package com.lvlp.stu.quick.controller;

import com.lvlp.stu.quick.config.DatasourceConfigurationProperties;
import com.lvlp.stu.quick.config.DatasourceProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author : 吕良平
 * @Date: 2024-09-12 12:35
 * @Description:
 */
@RestController
public class ConfigController {
    @Autowired
    //private DatasourceProperties datasourceProperties;
    private DatasourceConfigurationProperties datasourceProperties;

    @GetMapping("/config")
    public String config() {
        System.out.println(datasourceProperties.toString());
        return "config ok   " + datasourceProperties.toString();
    }
}
