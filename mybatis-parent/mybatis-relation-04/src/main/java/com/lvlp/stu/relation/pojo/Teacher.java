package com.lvlp.stu.relation.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/9 21:57
 */
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Teacher {
    private Integer tId;
    private String tName;
    private List<Student> studentList;
}
