package com.lvlp.stu.tx.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author : 吕良平
 * @Date: 2024-09-03 15:27
 * @Description:
 */
@Service
public class TopService {
    @Autowired
    private StudentService studentService;

    @Transactional //事务的传递性   此函数为一个事务  默认下面两个函数都会走这个函数的事务
    public void changeInfo() {
        studentService.changeAge();
        studentService.changeName();
    }
}
