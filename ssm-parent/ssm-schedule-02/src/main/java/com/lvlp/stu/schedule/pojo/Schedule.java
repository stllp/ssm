package com.lvlp.stu.schedule.pojo;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Author lvlp
 * @create 2024/9/10 20:55
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {
    private Integer id;
    private String title;
    private boolean completed;
}
