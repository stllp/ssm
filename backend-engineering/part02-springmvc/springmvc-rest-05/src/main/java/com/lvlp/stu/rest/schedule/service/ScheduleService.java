package com.lvlp.stu.rest.schedule.service;
import com.lvlp.stu.rest.schedule.pojo.Schedule;

import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/5 23:34
 */
public interface ScheduleService {

    /**
     * 返回全部的学习计划
     *
     * @return
     */
    List<Schedule> getAll();

    /**
     * 保存学习计划
     *
     * @param schedule
     */
    void savaSchedule(Schedule schedule);

    /**
     * 更新学习计划
     *
     * @param schedule
     */
    void updateSchedule(Schedule schedule);

    /**
     * 删除学习计划
     *
     * @param id
     */
    void removeById(Integer id);
}
