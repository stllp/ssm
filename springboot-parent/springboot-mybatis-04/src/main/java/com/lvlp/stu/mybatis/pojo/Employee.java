package com.lvlp.stu.mybatis.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author : 吕良平
 * @Date: 2024-09-14 9:48
 * @Description:
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Employee {
    private Integer empId;
    private String empName;
    private String empGender;
    private String empSalary;
}
