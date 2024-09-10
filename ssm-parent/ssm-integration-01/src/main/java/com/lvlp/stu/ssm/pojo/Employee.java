package com.lvlp.stu.ssm.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : 吕良平
 * @Date: 2024-09-10 13:47
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Employee {
    private Integer empId;
    private String empName;
    private String empGender;
    private double empSalary;
}
