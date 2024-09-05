package com.lvlp.stu.rest.schedule.controller;

import com.lvlp.stu.rest.schedule.pojo.Schedule;
import com.lvlp.stu.rest.schedule.service.ScheduleService;
import com.lvlp.stu.rest.schedule.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/5 23:52
 */
@RestController
@RequestMapping("/schedule")
@CrossOrigin //跨域注解
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    /**
     * 获取所有学习计划
     *
     * @return
     */
    @GetMapping
    public R listAll() {
        List<Schedule> scheduleList = scheduleService.getAll();
        return R.ok(scheduleList);
    }

    @PostMapping
    public R add(@RequestBody Schedule schedule) {
        scheduleService.savaSchedule(schedule);
        return R.ok(null);
    }

    @PutMapping
    public R modify(@RequestBody Schedule schedule) {
        scheduleService.updateSchedule(schedule);
        return R.ok(null);
    }

    @DeleteMapping("/{id}")
    public R delete(@PathVariable Integer id) {
        scheduleService.removeById(id);
        return R.ok(null);
    }
}
