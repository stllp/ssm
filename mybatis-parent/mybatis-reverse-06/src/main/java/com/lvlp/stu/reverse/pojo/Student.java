package com.lvlp.stu.reverse.pojo;

import java.io.Serializable;
import lombok.Data;

/**
 * @TableName t_student
 */
@Data
public class Student implements Serializable {
    private Integer sId;

    private String sName;

    private static final long serialVersionUID = 1L;
}