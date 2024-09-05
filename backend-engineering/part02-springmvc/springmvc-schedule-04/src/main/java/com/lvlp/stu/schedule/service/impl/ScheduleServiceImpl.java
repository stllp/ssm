package com.lvlp.stu.schedule.service.impl;

import com.lvlp.stu.schedule.pojo.Schedule;
import com.lvlp.stu.schedule.service.ScheduleService;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Author lvlp
 * @create 2024/9/5 23:38
 */
@Service
public class ScheduleServiceImpl implements ScheduleService {

    private static Map<Integer, Schedule> scheduleMap;
    private static int maxId = 5;

    static {
        scheduleMap = new HashMap<>();

        Schedule schedule = null;

        schedule = new Schedule(1, "学习java1", false);
        scheduleMap.put(schedule.getId(), schedule);
        schedule = new Schedule(2, "学习java2", false);
        scheduleMap.put(schedule.getId(), schedule);
        schedule = new Schedule(3, "学习java3", false);
        scheduleMap.put(schedule.getId(), schedule);
        schedule = new Schedule(4, "学习java4", false);
        scheduleMap.put(schedule.getId(), schedule);
        schedule = new Schedule(5, "学习java5", false);
        scheduleMap.put(schedule.getId(), schedule);
    }

    @Override
    public List<Schedule> getAll() {
        return new ArrayList<>(scheduleMap.values());
    }

    @Override
    public void savaSchedule(Schedule schedule) {
        maxId++;
        schedule.setId(maxId);
        scheduleMap.put(maxId, schedule);
    }

    @Override
    public void updateSchedule(Schedule schedule) {
        scheduleMap.put(schedule.getId(), schedule);
    }

    @Override
    public void removeById(Integer id) {
        scheduleMap.remove(id);
    }
}
