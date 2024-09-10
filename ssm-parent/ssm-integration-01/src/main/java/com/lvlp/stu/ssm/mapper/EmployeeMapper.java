package com.lvlp.stu.ssm.mapper;

import com.lvlp.stu.ssm.pojo.Employee;

import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-10 13:49
 * @Description:
 */
public interface EmployeeMapper {
    List<Employee> selectAll();
}
