package com.lvlp.stu.tx.service;

import com.lvlp.stu.tx.dao.StudentDao;
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
@Transactional //定义在类上  则所有的方法有有事务
public class StudentService {
    @Autowired
    private StudentDao studentDao;

    @Transactional(readOnly = false, timeout = 1, rollbackFor = FileNotFoundException.class,
            noRollbackFor = ArithmeticException.class,
            isolation = Isolation.READ_COMMITTED)
    // 类和方法都有该注解时    局部优先
    //readOnly = true 只读  就不走事务
    // timeout 超时回滚
    //rollbackFor = FileNotFoundException.class 需要回滚的异常
    //noRollbackFor = ArithmeticException.class 不需要回滚的异常
    //isolation = Isolation.READ_COMMITTED 事务的隔离级别  一般不要去修改
    public void chageInfo() throws FileNotFoundException {
        studentDao.updateAgeByID(700, 1);
//        int i = 10 / 0;
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("------------------------------");
//        new FileInputStream("H:\\a.txt");  //编译异常 默认不回滚
        studentDao.updateNameByID("6666", 1);

    }

    @Transactional(propagation = Propagation.REQUIRED)
    //propagation = Propagation.REQUIRED  默认走关联事务
    //propagation = Propagation.REQUIRES_NEW 自己创建新的事物
    public void changeName() {
        studentDao.updateNameByID("323232", 1);
        int i=1/0;
    }

    @Transactional(propagation = Propagation.REQUIRES_NEW)
    public void changeAge() {
        studentDao.updateAgeByID(700, 1);

    }
}
