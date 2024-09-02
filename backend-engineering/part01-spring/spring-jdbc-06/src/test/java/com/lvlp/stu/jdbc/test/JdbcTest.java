package com.lvlp.stu.jdbc.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

/**
 * @Author : 吕良平
 * @Date: 2024-09-02 16:38
 * @Description:
 */
@SpringJUnitConfig(locations = "classpath:spring.xml")
public class JdbcTest {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Test
    public void test() {
        String sql = "insert into student(name,gender,age,classes) value(?,?,?,?)";
        Object[] args = {"asjkasj", "女", 38, "幼儿园大班"};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Test
    public void test1() {
        String sql = "select * from student where c_id=?";
        jdbcTemplate.query(sql,);
    }


}
