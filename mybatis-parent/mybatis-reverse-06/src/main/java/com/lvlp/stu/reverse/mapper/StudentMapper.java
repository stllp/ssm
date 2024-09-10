package com.lvlp.stu.reverse.mapper;

import com.lvlp.stu.reverse.pojo.Student;

/**
* @author Administrator
* @description 针对表【t_student】的数据库操作Mapper
* @createDate 2024-09-10 11:26:05
* @Entity com.lvlp.stu.reverse.pojo.Student
*/
public interface StudentMapper {

    int deleteByPrimaryKey(Long id);

    int insert(Student record);

    int insertSelective(Student record);

    Student selectByPrimaryKey(Long id);

    int updateByPrimaryKeySelective(Student record);

    int updateByPrimaryKey(Student record);

}
