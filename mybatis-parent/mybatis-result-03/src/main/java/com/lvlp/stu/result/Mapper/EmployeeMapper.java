package com.lvlp.stu.result.Mapper;

import com.lvlp.stu.result.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author : 吕良平
 * @Date: 2024-09-09 13:37
 * @Description:
 */
public interface EmployeeMapper {
    /**
     * 查询总行数   查询单行单列
     *
     * @return
     */
    Integer selectcount();

    /**
     * 查询单行多列  实体对象
     *
     * @param empId
     * @return
     */
    Employee selectByEmpId(@Param("empId") Integer empId);

    /**
     * 根据性别查询  多行多列集合对象
     *
     * @param EmpGender
     * @return
     */
    List<Employee> selectByEmpGender(@Param("empGender") String empGender);

    /**
     * 查询结果为多列 且不可封装为对象时  使用Map接收
     */
    Map<String, Object> selectByMap();

    /**
     * 插入对象  主键回填
     *
     * @param employee
     * @return
     */
    Integer insert(Employee employee);
}
