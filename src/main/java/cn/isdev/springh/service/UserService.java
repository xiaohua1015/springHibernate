package cn.isdev.springh.service;

import cn.isdev.springh.bean.User;
import cn.isdev.springh.dao.UserDao;

/**
 * Created by Administrator on 2018/7/23.
 */
public class UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    public void save(User user) {
        userDao.save(user);
    }
}
