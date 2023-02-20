package com.liuyang.spring.service.impl;

import com.liuyang.spring.dao.UserDao;
import com.liuyang.spring.service.UserService;

public class UserServiceImpl implements UserService {
    private UserDao userDao;

    public void setUserDao(UserDao userDao) {
        this.userDao = userDao;
    }

    @Override
    public void save() {
        userDao.save();
    }
}
