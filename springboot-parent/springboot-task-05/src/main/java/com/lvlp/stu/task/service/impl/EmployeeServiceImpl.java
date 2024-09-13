package com.lvlp.stu.task.service.impl;

import com.lvlp.stu.task.mapper.EmployeeMapper;
import com.lvlp.stu.task.pojo.Employee;
import com.lvlp.stu.task.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-13 17:10
 * @Description:
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {
    @Autowired
    private EmployeeMapper employeeMapper;
    @Override
    public void sendMessage(String date) {
        List<Employee> employeeList = employeeMapper.selectAll(date);
        System.out.println("111");
        for (Employee employee : employeeList) {
            System.out.println("employee = " + employee );
        }
    }
}
