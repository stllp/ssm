package com.lvlp.stu.schedule.service;

import com.lvlp.stu.schedule.pojo.Schedule;
import com.lvlp.stu.schedule.util.PageBean;

import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/10 20:55
 */
public interface ScheduleService {

    List<Schedule> showAll();

    PageBean<Schedule> showAllByPage(Integer pageSize , Integer currentPage);
}
