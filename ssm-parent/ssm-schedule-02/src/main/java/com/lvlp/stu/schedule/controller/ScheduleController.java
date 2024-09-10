package com.lvlp.stu.schedule.controller;

import com.lvlp.stu.schedule.pojo.Schedule;
import com.lvlp.stu.schedule.service.ScheduleService;
import com.lvlp.stu.schedule.util.R;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/10 20:51
 */
@RestController
@RequestMapping("/schedule")
@CrossOrigin
public class ScheduleController {
    @Autowired
    private ScheduleService scheduleService;

    @GetMapping
    public R showAll() {
        List<Schedule> scheduleList = scheduleService.showAll();
        return R.ok(scheduleList);
    }
}
