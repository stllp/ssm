package com.lvlp.stu.spring.anno.dao.impl;

import com.lvlp.stu.spring.anno.dao.UserDao;
import com.lvlp.stu.spring.anno.pojo.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;

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
