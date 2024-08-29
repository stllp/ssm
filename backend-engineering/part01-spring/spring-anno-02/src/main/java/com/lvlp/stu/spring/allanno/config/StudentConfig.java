package com.lvlp.stu.spring.allanno.config;

import com.lvlp.stu.spring.allanno.pojo.Student;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

/**
 * @Author : 吕良平
 * @Date: 2024-08-29 17:44
 * @Description:
 */
@Configuration  // 子配置类 可写可不写  主配置类里面 @Import({StudentConfig.class}) 直接导入
public class StudentConfig {
    @Bean
    @Conditional(MyCondition.class)  //条件校验是否创建对象进入 容器
    public Student student() {
        return new Student("大道多多", "男");
    }

}
