package com.lvlp.stu.ssm.service.impl;

import com.lvlp.stu.ssm.mapper.EmployeeMapper;
import com.lvlp.stu.ssm.pojo.Employee;
import com.lvlp.stu.ssm.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-10 14:42
 * @Description:
 */
@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Employee> showAll() {
        return employeeMapper.selectAll();
    }
}
