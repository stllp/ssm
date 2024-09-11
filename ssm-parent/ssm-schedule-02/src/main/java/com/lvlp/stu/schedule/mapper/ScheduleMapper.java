package com.lvlp.stu.schedule.mapper;

import com.lvlp.stu.schedule.pojo.Schedule;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/10 20:59
 */
public interface ScheduleMapper {
    List<Schedule> selectAll();
}
