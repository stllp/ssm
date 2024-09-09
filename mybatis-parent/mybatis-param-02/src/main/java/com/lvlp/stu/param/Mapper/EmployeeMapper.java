package com.lvlp.stu.param.Mapper;

import com.lvlp.stu.param.pojo.Employee;
import org.apache.ibatis.annotations.Param;

import java.util.List;
import java.util.Map;

/**
 * @Author : 吕良平
 * @Date: 2024-09-09 13:37
 * @Description:
 */
public interface EmployeeMapper {
    List<Employee> selectAll();

    /**
     * 单个值接收  #{属性名}  实际可以叫任意名称
     *
     * @param id
     * @return
     */
    Employee selectByEmpId(int id);

    /**
     * 关键字 或 其它特殊情况下 使用 ${} 方式传值
     *
     * @param rules
     * @return
     */
    List<Employee> selectAllByRules(String rules);

    /**
     * 单个简单类型(八大基本+八大包装+String)  使用#{} 接收
     * @param empId
     * @return
     */
    int deleteByEmpId(Integer empId);

    /**
     * 传入实体对象 接收时直接取对象属性
     *
     * @param employee
     * @return
     */
    int insert(Employee employee);

    /**
     * 传入多个零散类型时 默认接收  [arg1, arg0, param1, param2]  或者 @Param("empId")  注解指定接收名称
     *
     * @param empById
     * @param empSalary
     * @return
     */
    int updateByEmpId(@Param("empId") int empById,
                      @Param("empSalary") double empSalary);

    /**
     * 多个值传参 使用Map集合传参   接收值时名称是Map的key值
     *
     * @param condition
     * @return
     */
    List<Employee> selectBySalaryAndGender(Map<String, Object> condition);

}
