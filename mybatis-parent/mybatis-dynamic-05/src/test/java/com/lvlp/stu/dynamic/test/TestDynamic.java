package com.lvlp.stu.dynamic.test;

import com.lvlp.stu.dynamic.mapper.EmployeeMapper;
import com.lvlp.stu.dynamic.pojo.Employee;
import com.lvlp.stu.dynamic.util.SqlSessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/9 23:42
 */
@Slf4j
public class TestDynamic {
    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("empId",1);
        map.put("empName","张三");
//        map.put("empGender","男");
//        map.put("empSalary",5000);
        List<Employee> employees = mapper.selectByCondition(map);
        for (Employee employee : employees) {
            log.info(employee.toString());
        }
        sqlSession.close();
    }
    @Test
    public void test1(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        HashMap<String, Object> map = new HashMap<>();
//        map.put("empId",1);
//        map.put("empName","张三");
//        map.put("empGender","男");
//        map.put("empSalary",5000);
        Integer row = mapper.updateByCondition(new Employee(1,null,null,7777));
        sqlSession.commit();
        System.out.println("row = " + row);
        sqlSession.close();
    }
}
