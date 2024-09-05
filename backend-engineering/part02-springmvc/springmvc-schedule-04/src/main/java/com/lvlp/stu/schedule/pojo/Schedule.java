package com.lvlp.stu.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author lvlp
 * @create 2024/9/5 23:14
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    private int id;
    private String title;
    private boolean completed;
}
