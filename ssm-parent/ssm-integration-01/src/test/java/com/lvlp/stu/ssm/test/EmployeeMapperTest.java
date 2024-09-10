package com.lvlp.stu.ssm.test;

import com.lvlp.stu.ssm.mapper.EmployeeMapper;
import com.lvlp.stu.ssm.pojo.Employee;
import lombok.extern.slf4j.Slf4j;
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
 * @Date: 2024-09-10 14:31
 * @Description:
 */
@Slf4j
public class EmployeeMapperTest {
    @Test
    public void test() throws IOException {
        InputStream resourceAsStream = Resources.getResourceAsStream("mybatis-config.xml");
        SqlSessionFactory sqlSessionFactory = new SqlSessionFactoryBuilder().build(resourceAsStream);
        SqlSession sqlSession = sqlSessionFactory.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeeList = mapper.selectAll();
        for (Employee employee : employeeList) {
            log.info(employee.toString());
        }
        sqlSession.close();
    }

}
