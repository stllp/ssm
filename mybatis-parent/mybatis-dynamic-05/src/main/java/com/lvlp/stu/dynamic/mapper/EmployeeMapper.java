package com.lvlp.stu.dynamic.mapper;

import com.lvlp.stu.dynamic.pojo.Employee;

import java.util.List;
import java.util.Map;

/**
 * @Author lvlp
 * @create 2024/9/9 23:46
 */
public interface EmployeeMapper {
    /**
     * if  whewre 关键字
     *
     * @param condition
     * @return
     */

    List<Employee> selectByCondition(Map<String, Object> condition);

    /**
     * set 关键字
     *
     * @param employee
     * @return
     */
    Integer updateByCondition(Employee employee);

    /**
     * trim 关键字 代替where
     *
     * @param condition
     * @return
     */
    List<Employee> selectByTrimCondition(Map<String, Object> condition);

    /**
     * trim关键字代替 set
     *
     * @param employee
     * @return
     */
    Integer updateByTrimCondition(Employee employee);

    /**
     * choose when otherwise 关键字
     *
     * @return
     */
    List<Employee> selectByChooseCondition(Map<String, Object> condition);

    /**
     * foreach 关键字  批量查询
     *
     * @param ids
     * @return
     */
    List<Employee> selectByForeachIds(Integer... ids);

    /**
     * foreach 关键字 批量插入
     *
     * @param employeeList
     * @return
     */
    Integer insertByForeach(List<Employee> employeeList);

    /**
     * foreach 批量修改
     *
     * @param employeeList
     * @return
     */
    Integer updateByForeach(List<Employee> employeeList);

    /**
     * 分页查询
     * @return
     */
    List<Employee> selectAll();
}
