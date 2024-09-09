package com.lvlp.stu.dynamic.mapper;

import com.lvlp.stu.dynamic.pojo.Employee;

import java.util.List;
import java.util.Map;
import java.util.Objects;

/**
 * @Author lvlp
 * @create 2024/9/9 23:46
 */
public interface EmployeeMapper {

    List<Employee> selectByCondition(Map<String, Object> condition);

    Integer updateByCondition(Employee employee);
}
