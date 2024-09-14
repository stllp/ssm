package com.lvlp.stu.mybatis.controller;

import com.lvlp.stu.mybatis.pojo.Employee;
import com.lvlp.stu.mybatis.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-14 9:58
 * @Description:
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;
    @GetMapping
    public List<Employee> showAll() {
        return employeeService.showAll();
    }
}

