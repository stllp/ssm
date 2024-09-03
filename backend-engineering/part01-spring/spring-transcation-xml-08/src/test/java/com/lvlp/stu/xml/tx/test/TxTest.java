package com.lvlp.stu.xml.tx.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import com.lvlp.stu.xml.tx.service.StudentService;

import java.io.FileNotFoundException;

/**
 * @Author : 吕良平
 * @Date: 2024-09-03 17:06
 * @Description:
 */
@SpringJUnitConfig(locations = "classpath:spring.xml")
public class TxTest {
    @Autowired
    private StudentService studentService;
    @Test
    public void test() throws FileNotFoundException {
        studentService.chageInfo();
    }
}
