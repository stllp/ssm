package com.lvlp.stu.mvc.config;

import com.lvlp.stu.mvc.interceptor.MyInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * @Author : 吕良平
 * @Date: 2024-09-14 9:25
 * @Description:
 */
@Configuration
public class MvcConfig implements WebMvcConfigurer {
    @Autowired
    private MyInterceptor myInterceptor;

    //在springmvc的结果中 添加自定义拦截器
    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        //只是添加了拦截器 默认对当前项目中的所有资源都会拦截
//        registry.addInterceptor(myInterceptor).addPathPatterns("/target/**").excludePathPatterns("/target/m1");
        registry.addInterceptor(myInterceptor).addPathPatterns("/hello");
    }
}
