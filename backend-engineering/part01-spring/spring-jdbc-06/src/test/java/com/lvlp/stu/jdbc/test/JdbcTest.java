package com.lvlp.stu.jdbc.test;

import com.lvlp.stu.jdbc.pojo.Student;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import java.util.List;

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
        Object[] args = {"zhangsan", "男", 38, "幼儿园大班"};
        int update = jdbcTemplate.update(sql, args);
        System.out.println(update);
    }

    @Test
    public void test1() {
        String sql = "select * from student where id=1";
        BeanPropertyRowMapper<Student> studentBeanPropertyRowMapper = new BeanPropertyRowMapper<>(Student.class);
        Student student = jdbcTemplate.queryForObject(sql, studentBeanPropertyRowMapper);
        System.out.println(student);
    }

    @Test
    public void test2() {
        String sql = "select * from student ";
        BeanPropertyRowMapper<Student> studentBeanPropertyRowMapper = new BeanPropertyRowMapper<>(Student.class);
        List<Student> query = jdbcTemplate.query(sql, studentBeanPropertyRowMapper);
        System.out.println(query);
    }


}
