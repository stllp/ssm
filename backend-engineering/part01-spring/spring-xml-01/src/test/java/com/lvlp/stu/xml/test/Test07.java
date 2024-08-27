package com.lvlp.stu.xml.test;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLException;

public class Test07 {
    @Test
    public void test() throws SQLException {
        ApplicationContext ioc = new ClassPathXmlApplicationContext("spring06.xml");

        DruidDataSource dataSource = ioc.getBean("dataSource", DruidDataSource.class);

        DruidPooledConnection connection = dataSource.getConnection();
        System.out.println(connection);

    }
}
