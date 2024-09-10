package com.lvlp.stu.ssm.test;

import com.lvlp.stu.ssm.pojo.Employee;
import com.lvlp.stu.ssm.service.EmployeeService;
import lombok.extern.slf4j.Slf4j;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-10 16:14
 * @Description:
 */
@Slf4j
@SpringJUnitConfig(locations = {"classpath:spring-mapper.xml", "classpath:spring-service.xml"})
public class EmployeeServiceTest {
    @Autowired
    private EmployeeService employeeService;

    @Test
    public void showAll() {
        List<Employee> employeeList = employeeService.showAll();
        for (Employee employee : employeeList) {
            log.info(employee.toString());
        }
    }
}
