package com.lvlp.stu.xml.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author : 吕良平
 * @Date: 2024-09-03 15:27
 * @Description:
 */
@Service
public class TopService {
    @Autowired
    private StudentService studentService;

    public void changeInfo() {
        studentService.changeAge();
        studentService.changeName();
    }
}
