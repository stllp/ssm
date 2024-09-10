package com.lvlp.stu.ssm.controller;

import com.lvlp.stu.ssm.pojo.Employee;
import com.lvlp.stu.ssm.service.EmployeeService;
import com.lvlp.stu.ssm.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-10 16:25
 * @Description:
 */
@RestController
@RequestMapping("/emp")
public class EmployeeController {
    @Autowired
    private EmployeeService employeeService;

    @GetMapping
    public R showAll() {
        List<Employee> employeeList = employeeService.showAll();
        return R.ok(employeeList);
    }
}
