package com.lvlp.stu.schedule.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.lvlp.stu.schedule.mapper.ScheduleMapper;
import com.lvlp.stu.schedule.pojo.Schedule;
import com.lvlp.stu.schedule.service.ScheduleService;
import com.lvlp.stu.schedule.util.PageBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @Author lvlp
 * @create 2024/9/10 20:57
 */
@Service
@Transactional
public class ScheduleServiceImpl implements ScheduleService {
    @Autowired
    private ScheduleMapper scheduleMapper;

    @Override
    @Transactional(readOnly = true)
    public List<Schedule> showAll() {
        return scheduleMapper.selectAll();
    }

    @Override
    public PageBean<Schedule> showAllByPage(Integer pageNum, Integer pageSize) {
        PageHelper.startPage(pageNum, pageSize);
        List<Schedule> scheduleList = scheduleMapper.selectAll();

        PageInfo<Schedule> schedulePageInfo = new PageInfo<>(scheduleList);
        PageBean<Schedule> schedulePageBean = new PageBean<>();
        schedulePageBean.setCurrentPage(schedulePageInfo.getPageNum());
        schedulePageBean.setData(scheduleList);
        schedulePageBean.setTotal(schedulePageInfo.getTotal());
        schedulePageBean.setPageSize(schedulePageInfo.getPageSize());
        return schedulePageBean;
    }
}
