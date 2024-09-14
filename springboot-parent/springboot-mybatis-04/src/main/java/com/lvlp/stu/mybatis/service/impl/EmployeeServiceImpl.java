package com.lvlp.stu.mybatis.service.impl;

import com.lvlp.stu.mybatis.mapper.EmployeeMapper;
import com.lvlp.stu.mybatis.pojo.Employee;
import com.lvlp.stu.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-14 9:57
 * @Description:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    public List<Employee> showAll() {
        return employeeMapper.selectAll();
    }
}
