package com.lvlp.stu.quick.test;

import com.lvlp.stu.quick.mapper.EmployeeMapper;
import com.lvlp.stu.quick.pojo.Employee;
import com.lvlp.stu.quick.util.SqlSessionUtil;
import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-09 10:45
 * @Description:
 */
public class TestMyBatis {
    @Test
    public void test() throws IOException {
        //1、读取mybatis的配置文件
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        //2、创建SqlSessionFactory 工厂
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        //3、创建 sqlSession
        SqlSession sqlSession = sqlSessionFactory.openSession();
        //4、sqlSession 窗口 EmployeeMapper 对象
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        //5、EmployeeMapper 对象 调用方法
        List<Employee> employees = mapper.selectAll();
        //6、处理结果
        employees.forEach(System.out::println);

//        for (Employee employee : employees) {
//            System.out.println("employee" + employee);
//        }
        //7、释放资源
        sqlSession.close();

    }
    @Test
    public void test01(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        //4、sqlSession 窗口 EmployeeMapper 对象
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        //5、EmployeeMapper 对象 调用方法
        List<Employee> employees = mapper.selectAll();
        //6、处理结果
        employees.forEach(System.out::println);

//        for (Employee employee : employees) {
//            System.out.println("employee" + employee);
//        }
        //7、释放资源
        sqlSession.close();
    }
}
