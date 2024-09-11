package com.lvlp.stu.schedule.util;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

/**
 * @Author : 吕良平
 * @Date: 2024-09-11 15:16
 * @Description:
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class PageBean<T> {
    private long total; //总行数

    private int pageSize; //每页显示的数据量

    private int currentPage;//当前页码
    private List<T> data;//当前页面的数据集合

}
