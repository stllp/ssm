package com.lvlp.stu.spring.allanno.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.lvlp.stu.spring.allanno.pojo.HappyComponent;
import com.lvlp.stu.spring.allanno.pojo.HappyMachine;
import com.lvlp.stu.spring.allanno.pojo.Student;
import com.lvlp.stu.spring.allanno.pojo.User;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.*;

//配置类 平替 xml 文件 spring-anno.xml
@Configuration
@ComponentScan("com.lvlp.stu.spring.allanno") ////@ComponentScan(basePackages = {"com.lvlp.stu.spring.anno"})
@PropertySource({"classpath:config.properties", "classpath:db.properties"})
@Import({StudentConfig.class}) //导入配置类  处理多个配置类的情况  4版本之后支持导入的配置类不需要加@Configuration注解 主要是方便查看或忘记写 @Configuration
public class SpringConfig {
    //    @Value("${jdbc.driverClassName}")
//    private String driverClassName;
//    @Value("${jdbc.url}")
//    private String url;
//    @Value("${jdbc.password}")
//    private String passWord;
//    @Value("${jdbc.username}")
//    private String userName;
//    @Bean
//    public DruidDataSource dataSource() {
//        DruidDataSource dataSource = new DruidDataSource();
//        dataSource.setDriverClassName(driverClassName);
//        dataSource.setUrl(url);
//        dataSource.setUsername(userName);
//        dataSource.setPassword(passWord);
//        return dataSource;
//    }
    @Bean(name = {"d1", "d2"})//默认方法名即为ID
    @Scope(scopeName = "prototype")
    public DruidDataSource dataSource(@Value("${jdbc.driverClassName}") String driverClassName,
                                      @Value("${jdbc.url}") String url,
                                      @Value("${jdbc.username}") String userName,
                                      @Value("${jdbc.password}") String passWord) {
        DruidDataSource dataSource = new DruidDataSource();
        dataSource.setDriverClassName(driverClassName);
        dataSource.setUrl(url);
        dataSource.setUsername(userName);
        dataSource.setPassword(passWord);
        return dataSource;
    }

    @Bean(initMethod = "init", destroyMethod = "destroy")
    public User user() {
        return new User();
    }

    @Bean
    public HappyMachine happyMachine() {
        HappyMachine happyMachine = new HappyMachine();
        happyMachine.setMachineName("小爱同学");
        return happyMachine;
    }

    @Bean
    public HappyComponent happyComponent(HappyMachine happyMachine) {
        HappyComponent happyComponent = new HappyComponent();
        happyComponent.setHappyMachine(happyMachine);
        return happyComponent;
    }

}
