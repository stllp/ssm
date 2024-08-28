package com.lvlp.stu.spring.anno.service.impl;

import com.lvlp.stu.spring.anno.dao.UserDao;
import com.lvlp.stu.spring.anno.pojo.User;
import com.lvlp.stu.spring.anno.service.UserService;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
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
