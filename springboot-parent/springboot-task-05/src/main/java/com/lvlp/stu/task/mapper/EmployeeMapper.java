package com.lvlp.stu.task.mapper;

import com.lvlp.stu.task.pojo.Employee;
import lombok.Data;
import org.apache.ibatis.annotations.Mapper;

import java.util.Date;
import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-13 17:04
 * @Description:
 */
@Mapper
public interface EmployeeMapper {

    List<Employee> selectAll(String date);
}
