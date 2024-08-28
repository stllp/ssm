package com.lvlp.stu.spring.xml.dao.impl;

import com.lvlp.stu.spring.xml.dao.UserDao;
import com.lvlp.stu.spring.xml.pojo.User;

import java.util.List;

public class UserDaoImpl implements UserDao {
    @Override
    public List<User> showAll() {
        System.out.println("UserDaoImpl 的 showAll 方法被执行了");
        List<User> userList = null;
        return userList;
    }
}
