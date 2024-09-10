package com.lvlp.stu.dynamic.test;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lvlp.stu.dynamic.mapper.EmployeeMapper;
import com.lvlp.stu.dynamic.pojo.Employee;
import com.lvlp.stu.dynamic.util.SqlSessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/9 23:42
 */
@Slf4j
public class TestDynamic {
    @Test
    public void test() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        HashMap<String, Object> map = new HashMap<>();
        map.put("empId", 1);
        map.put("empName", "张三");
//        map.put("empGender","男");
//        map.put("empSalary",5000);
        List<Employee> employees = mapper.selectByCondition(map);
        for (Employee employee : employees) {
            log.info(employee.toString());
        }
        sqlSession.close();
    }

    @Test
    public void test1() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        HashMap<String, Object> map = new HashMap<>();
//        map.put("empId",1);
//        map.put("empName","张三");
//        map.put("empGender","男");
//        map.put("empSalary",5000);
        Integer row = mapper.updateByCondition(new Employee(1, null, null, 7777));
        sqlSession.commit();
        System.out.println("row = " + row);
        sqlSession.close();
    }

    @Test
    public void test2() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        HashMap<String, Object> map = new HashMap<>();
//        map.put("empId",2);
//        map.put("empName","张三");
//        map.put("empGender","男");
//        map.put("empSalary",5000);
        List<Employee> employees = mapper.selectByTrimCondition(map);
        for (Employee employee : employees) {
            log.info(employee.toString());
        }
        sqlSession.close();
    }

    @Test
    public void test3() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        Integer row = mapper.updateByTrimCondition(new Employee(2, null, null, 0));
        sqlSession.commit();
        System.out.println("row = " + row);
        sqlSession.close();
    }

    @Test
    public void test4() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        HashMap<String, Object> map = new HashMap<>();
//        map.put("empId",2);
//        map.put("empName","张三");
//        map.put("empGender","男");
//        map.put("empSalary",5000);
        List<Employee> employees = mapper.selectByChooseCondition(map);
        for (Employee employee : employees) {
            log.info(employee.toString());
        }
        sqlSession.close();
    }

    @Test
    public void test5() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employees = mapper.selectByForeachIds(1, 2, 3, 4, 5);
        for (Employee employee : employees) {
            log.info(employee.toString());
        }
        sqlSession.close();
    }

    @Test
    public void test6() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(null, "smith", "男", 1111));
        employeeList.add(new Employee(null, "lucky", "女", 2222));
        employeeList.add(new Employee(null, "tom", "男", 3333));
        Integer i = mapper.insertByForeach(employeeList);
        log.info(i.toString());
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test7() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(2, null, null, 1111));
        employeeList.add(new Employee(3, null, null, 2222));
        employeeList.add(new Employee(4, null, null, 3333));
        Integer i = mapper.updateByForeach(employeeList);
        log.info(i.toString());
        sqlSession.commit();
        sqlSession.close();
    }

    @Test
    public void test8() {
        SqlSession sqlSession = SqlSessionUtil.openSession();
        EmployeeMapper mapper = sqlSession.getMapper(EmployeeMapper.class);
        //分页设置在 查询之前
        //mybatis-config.xml 需要引入依赖
        // <plugins>
        //    <plugin interceptor="com.github.pagehelper.PageInterceptor"></plugin>
        //</plugins>
        PageHelper.startPage(4, 3);
        List<Employee> employeeList = mapper.selectAll();
        for (Employee employee : employeeList) {
            log.info(employee.toString());
        }
        PageInfo<Employee> listPageInfo = new PageInfo<>(employeeList);
        System.out.println("当前页=" + listPageInfo.getPageNum());
        System.out.println("总页数=" + listPageInfo.getPages());
        System.out.println("上一页=" + listPageInfo.getPrePage());
        System.out.println("下一页=" + listPageInfo.getNextPage());
        System.out.println("是否首页=" + listPageInfo.isIsFirstPage());

        sqlSession.close();
    }
}
