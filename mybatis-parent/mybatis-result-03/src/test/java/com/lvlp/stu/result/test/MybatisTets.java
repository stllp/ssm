package com.lvlp.stu.result.test;

import com.lvlp.stu.result.Mapper.EmployeeMapper;
import com.lvlp.stu.result.Mapper.OrderMapper;
import com.lvlp.stu.result.pojo.Employee;
import com.lvlp.stu.result.pojo.Order;
import com.lvlp.stu.result.util.SqlSessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @Author : 吕良平
 * @Date: 2024-09-09 15:30
 * @Description:
 */
@Slf4j
public class MybatisTets {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//        Integer selectcount = mapper.selectcount();
//        System.out.println("selectcount = " + selectcount);
//        Employee employee = mapper.selectByEmpId(2);
//        System.out.println("employee = " + employee);
//        List<Employee> employeeList = mapper.selectByEmpGender("男");
//        for (Employee employee : employeeList) {
//            System.out.println(employee);
//        }
        //System.out.println("employeeList = " + employeeList);
//        Map<String, Object> map = mapper.selectByMap();
//        Set<Map.Entry<String, Object>> entries = map.entrySet();
//        for (Map.Entry<String, Object> entry : entries) {
//            System.out.println("entry = " + entry);
//        }
        Employee employee = new Employee(0, "sjks", "女", 7878);
        Integer insert = mapper.insert(employee);
        System.out.println("insert = " + insert);
        System.out.println(employee);

    }

    @Test
    public void test1() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        OrderMapper mapper = sqlSession.getMapper(OrderMapper.class);
        Order order = new Order(null, "3000");
        Integer insert = mapper.insert(order);
        System.out.println("insert = " + insert);
        System.out.println(order);
        log.info(order.toString());
    }
}
