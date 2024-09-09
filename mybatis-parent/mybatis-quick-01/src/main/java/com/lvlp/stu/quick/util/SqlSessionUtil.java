package com.lvlp.stu.quick.util;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

/**
 * @Author : 吕良平
 * @Date: 2024-09-09 11:39
 * @Description:
 */
public class SqlSessionUtil {
    private static SqlSessionFactory sqlSessionFactory = null;

    static {
        try {
            //1、读取mybatis的配置文件
            InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
            //2、创建SqlSessionFactory 工厂
            sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static SqlSession openSession() {
        return sqlSessionFactory.openSession();
    }

}
