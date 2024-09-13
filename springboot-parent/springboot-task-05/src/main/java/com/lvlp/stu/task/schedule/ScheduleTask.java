package com.lvlp.stu.task.schedule;

import com.lvlp.stu.task.service.EmployeeService;
import org.joda.time.DateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * @Author : 吕良平
 * @Date: 2024-09-13 17:15
 * @Description:
 */
@Component
public class ScheduleTask {
    @Autowired
    private EmployeeService employeeService;
//    @Scheduled(cron = "0 30 8 * * ?")
    @Scheduled(cron = "0/5 * * * * ?")
    public void execute() {
        DateTime dateTime = new DateTime();
        System.out.println("execute");
        employeeService.sendMessage(dateTime.plusDays(1).toString("yyyy-MM-dd"));
    }
}
