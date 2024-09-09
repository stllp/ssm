package com.lvlp.stu.relation.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/9 21:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Student {
    private Integer sId;
    private String sName;
    private List<Teacher> teacherList;
}
