package com.lvlp.stu.mybatis.mapper;

import com.lvlp.stu.mybatis.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-14 9:50
 * @Description:
 */
@Mapper
public interface EmployeeMapper {
    List<Employee> selectAll();
}
