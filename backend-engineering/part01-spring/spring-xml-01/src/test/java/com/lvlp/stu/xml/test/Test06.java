package com.lvlp.stu.xml.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import com.lvlp.stu.xml.pojo.HappyComponent;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test06 {
    @Test
    public void test() throws SQLException {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/schedule_system");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("123456");

        DruidPooledConnection connection = druidDataSource.getConnection();
        System.out.println(connection);

    }
    @Test
    public void test1() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring06.xml");

        DruidDataSource dataSource = ioc.getBean("dataSource", DruidDataSource.class);

        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);

    }
}
