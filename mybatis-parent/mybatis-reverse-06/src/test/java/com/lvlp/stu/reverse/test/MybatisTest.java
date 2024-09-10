package com.lvlp.stu.reverse.test;

import com.lvlp.stu.reverse.mapper.StudentMapper;
import com.lvlp.stu.reverse.pojo.Student;
import com.lvlp.stu.reverse.util.SqlSessionUtil;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.junit.jupiter.api.Test;

/**
 * @Author : 吕良平
 * @Date: 2024-09-10 11:30
 * @Description:
 */
@Slf4j
public class MybatisTest {
    @Test
    public void test(){
        SqlSession sqlSession = SqlSessionUtil.openSession();
        StudentMapper mapper = sqlSession.getMapper(StudentMapper.class);
        Student student = mapper.selectByPrimaryKey(1l);
        System.out.println("student = " + student);
    }
}
