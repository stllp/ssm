package com.lvlp.stu.spring.anno.service.impl;

import com.lvlp.stu.spring.anno.dao.UserDao;
import com.lvlp.stu.spring.anno.pojo.User;
import com.lvlp.stu.spring.anno.service.UserService;
import jakarta.annotation.Resource;
import org.springframework.stereotype.Service;

import java.util.List;

//@Component
@Service
public class UserServiceImpl implements UserService {
    //    @Autowired //spring 提供的自动注入 先找类型 再找名字  搭配@Qualifier 完成 多类型的情况  也可以使用@Repository ("userDao")
//    @Qualifier("userDaoV2Impl")
    @Resource //jakarta 提供的自动注入  先找名字再找类型  搭配@Repository ("userDao")  完成 多类型的情况
    private UserDao userDao;
//    public void setUserDao(UserDao userDao) {
//        this.userDao = userDao;
//    }

    @Override
    public List<User> showList() {
        System.out.println("UserServiceImpl 的 showList 方法被执行了");
        return userDao.showAll();
    }


}
