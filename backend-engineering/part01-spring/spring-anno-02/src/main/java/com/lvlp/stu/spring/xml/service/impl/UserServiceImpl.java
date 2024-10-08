package com.lvlp.stu.spring.xml.service.impl;

import com.lvlp.stu.spring.xml.dao.UserDao;
import com.lvlp.stu.spring.xml.pojo.User;
import com.lvlp.stu.spring.xml.service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDao;
    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public List<User> showList() {
        System.out.println("UserServiceImpl 的 showList 方法被执行了");
        return userDao.showAll();
    }


}
