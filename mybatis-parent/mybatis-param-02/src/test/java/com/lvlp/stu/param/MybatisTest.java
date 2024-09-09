package com.lvlp.stu.param;

import com.lvlp.stu.param.Mapper.EmployeeMapper;
import com.lvlp.stu.param.pojo.Employee;
import com.lvlp.stu.param.util.SqlSessionUtil;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author : 吕良平
 * @Date: 2024-09-09 13:43
 * @Description:
 */
public class MybatisTest {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
//        List<Employee> employees = mapper.selectAll();
//        employees.forEach(System.out::println);
//        Employee employee = mapper.selectByEmpId(1);
//        System.out.println("employee = " + employee);
//        List<Employee> employees = mapper.selectAllByRules("desc");
//        employees.forEach(System.out::println);
//        int i = mapper.deleteByEmpId(1);
//        int i = mapper.insert(new Employee(0, "lisi1", "男", 8888.88));
//        int i = mapper.updateByEmpId(4, 7777.77);
//        if (i >0 ) {
//            sqlSession.commit();
//        }else {
//            sqlSession.rollback();
//        }
//        System.out.println("i = " + i);
        HashMap<String, Object> map = new HashMap<>();
        map.put("empSalary",8000);
        map.put("empGender","男");
        List<Employee> employees = mapper.selectBySalaryAndGender(map);
        employees.forEach(System.out::println);
        sqlSession.close();
    }
}
