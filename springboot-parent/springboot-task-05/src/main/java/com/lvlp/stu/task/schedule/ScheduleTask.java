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
    private EmployeeService employeeService; //每天8:30执行一次
//    @Scheduled(cron = "0 30 8 * * ?")
    @Scheduled(cron = "0/5 * * * * ?") //每5秒执行一次  写法搜索cron在线生成器
    public void execute() {
        DateTime dateTime = new DateTime();
        employeeService.sendMessage(dateTime.plusDays(1).toString("yyyy-MM-dd"));
    }
}
