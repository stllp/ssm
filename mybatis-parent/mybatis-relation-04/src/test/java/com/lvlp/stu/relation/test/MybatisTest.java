package com.lvlp.stu.relation.test;

import com.lvlp.stu.relation.mapper.CustomerMapper;
import com.lvlp.stu.relation.mapper.OrderMapper;
import com.lvlp.stu.relation.mapper.StudentMapper;
import com.lvlp.stu.relation.pojo.Customer;
import com.lvlp.stu.relation.pojo.Order;
import com.lvlp.stu.relation.pojo.Student;
import com.lvlp.stu.relation.util.SqlSessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/9 20:07
 */
@Slf4j
public class MybatisTest {
    @Test
    public void testOrder() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        Order order = mapper.selectOrderAndCustomer(1);
        System.out.println("order = " + order);

    }

    @Test
    public void testCustomer() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        CustomerMapper mapper = sqlSession.getMapper(CustomerMapper.class);
        Customer customer = mapper.selectCustomerAndOrders(1);
        System.out.println("customer = " + customer);

    }

    @Test
    public void testStudent() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        List<Student> students = mapper.selectStudentAndTeacher();
        for (Student student : students) {
            log.info(student.toString());
        }

    }
}
