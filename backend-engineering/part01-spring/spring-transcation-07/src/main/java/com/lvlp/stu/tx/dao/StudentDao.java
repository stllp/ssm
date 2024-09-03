package com.lvlp.stu.tx.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

/**
 * @Author : 吕良平
 * @Date: 2024-09-03 14:02
 * @Description:
 */
@Repository
public class StudentDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void updateNameByID(String name, int id) {
        String sql = "update student set name=? where id=?";
        int update = jdbcTemplate.update(sql, name, id);
        System.out.println("update=" + update);
    }

    public void updateAgeByID(int age, int id) {
        String sql = "update student set age=? where id=?";
        int update = jdbcTemplate.update(sql, age, id);
        System.out.println("update=" + update);
    }
}
