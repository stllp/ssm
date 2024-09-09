package com.lvlp.stu.quick.mapper;

import com.lvlp.stu.quick.pojo.Employee;

import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-09 10:24
 * @Description:
 */
public interface EmployeeMapper {
    List<Employee> selectAll();
}
