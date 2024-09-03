package com.lvlp.stu.xml.tx.service;

import com.lvlp.stu.xml.tx.dao.StudentDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.io.FileNotFoundException;

/**
 * @Author : 吕良平
 * @Date: 2024-09-03 14:09
 * @Description:
 */
@Service
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    public void chageInfo() throws FileNotFoundException {
        studentDao.updateAgeByID(700, 1);
//        int i = 10 / 0;
//        try {
//            Thread.sleep(500);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println("------------------------------");
//        new FileInputStream("H:\\a.txt");  //编译异常 默认不回滚
        studentDao.updateNameByID("6666", 1);

    }
    public void changeName() {
        studentDao.updateNameByID("323232", 1);
        int i = 1 / 0;
    }
    public void changeAge() {
        studentDao.updateAgeByID(700, 1);

    }
}
