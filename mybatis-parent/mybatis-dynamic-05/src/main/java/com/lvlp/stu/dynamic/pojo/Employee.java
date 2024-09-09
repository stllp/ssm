package com.lvlp.stu.dynamic.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author lvlp
 * @create 2024/9/9 23:44
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer empId;
    private String empName;
    private String empGender;
    private double empSalary;
}
