package com.lvlp.stu.relation.mapper;

import com.lvlp.stu.relation.pojo.Student;

import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/9 21:58
 */
public interface StudentMapper {

    List<Student> selectStudentAndTeacher();
}
