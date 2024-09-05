package com.lvlp.stu.schedule.controller;

import com.lvlp.stu.schedule.pojo.Schedule;
import com.lvlp.stu.schedule.service.ScheduleService;
import com.lvlp.stu.schedule.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/5 23:52
 */
@RestController
@RequestMapping("/schedule")
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    /**
     * 获取所有学习计划
     *
     * @return
     */
    @GetMapping("/listAll")
    public R listAll() {
        List<Schedule> scheduleList = scheduleService.getAll();
        return R.ok(scheduleList);
    }

    @PostMapping("add")
    public R add(@RequestBody Schedule schedule) {
        scheduleService.savaSchedule(schedule);
        return R.ok(null);
    }

    @PostMapping("/modify")
    public R modify(@RequestBody Schedule schedule) {
        scheduleService.updateSchedule(schedule);
        return R.ok(null);
    }

    @GetMapping("/delete")
    public R delete(Integer id) {
        scheduleService.removeById(id);
        return R.ok(null);
    }

    @GetMapping("/remove/{id}")
    public R remove(@PathVariable Integer id) {
        scheduleService.removeById(id);
        return R.ok(null);
    }
}
