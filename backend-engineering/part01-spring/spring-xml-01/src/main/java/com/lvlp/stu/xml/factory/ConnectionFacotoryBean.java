package com.lvlp.stu.xml.factory;

import org.springframework.beans.factory.FactoryBean;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * FactoryBean 工厂对象机制  用于生产第三方接口的对象 处理没有构造器情况下创建的对象加入IOC容器
 */

public class ConnectionFacotoryBean implements FactoryBean<Connection> {
    /**
     * 该工厂对象最终生产出的对象
     */
    @Override
    public Connection getObject() throws Exception {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/schedule_system"
                , "root", "123456");
        return connection;
    }

    //该工厂对象生产的对象类型
    @Override
    public Class<?> getObjectType() {
        return Connection.class;
    }

    //该工厂对象生产的对象是否是单例
    @Override
    public boolean isSingleton() {
        return true;
    }
}
