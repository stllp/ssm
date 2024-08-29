package com.lvlp.stu.spring.anno.dao.impl;

import com.lvlp.stu.spring.anno.dao.UserDao;
import com.lvlp.stu.spring.anno.pojo.User;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Component
@Repository ("userDao") //存在多个类型的对象时  需要自己命名来区分  先找类型 再找ID 有多个时找ID  找不到报错
public class UserDaoV2Impl implements UserDao {
    @Override
    public List<User> showAll() {
        System.out.println("UserDaoV2Impl 的 showAll 方法被执行了");
        List<User> userList = null;
        return userList;
    }
}
