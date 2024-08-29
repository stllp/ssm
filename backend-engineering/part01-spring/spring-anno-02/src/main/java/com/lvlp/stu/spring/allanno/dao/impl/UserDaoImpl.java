package com.lvlp.stu.spring.allanno.dao.impl;

import com.lvlp.stu.spring.allanno.dao.UserDao;
import com.lvlp.stu.spring.allanno.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;
//@Component
@Repository
public class UserDaoImpl implements UserDao {
    @Override
    public List<User> showAll() {
        System.out.println("UserDaoImpl 的 showAll 方法被执行了");
        List<User> userList = null;
        return userList;
    }
}
