package com.lvlp.stu.quick.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.extern.slf4j.Slf4j;

/**
 * @Author : 吕良平
 * @Date: 2024-09-09 8:59
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
@Slf4j
public class Employee {
    private int empId;
    private String empName;
    private double empSalary;
    private String empGender;
}
