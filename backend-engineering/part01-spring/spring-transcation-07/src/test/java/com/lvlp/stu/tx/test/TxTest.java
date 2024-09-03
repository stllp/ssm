package com.lvlp.stu.tx.test;

import com.lvlp.stu.tx.config.SpringConfig;
import com.lvlp.stu.tx.service.StudentService;
import com.lvlp.stu.tx.service.TopService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.io.FileNotFoundException;

/**
 * @Author : 吕良平
 * @Date: 2024-09-03 14:12
 * @Description:
 */
//@SpringJUnitConfig(locations = "classpath:spring.xml")
@SpringJUnitConfig(classes = SpringConfig.class)
public class TxTest {
    @Autowired
    private StudentService studentService;
    @Autowired
    private TopService topService;

    @Test
    public void test() throws FileNotFoundException {
//        studentService.chageInfo();
        topService.changeInfo();
    }
}
