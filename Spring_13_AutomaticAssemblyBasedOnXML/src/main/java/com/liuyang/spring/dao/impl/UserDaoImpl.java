package com.liuyang.spring.dao.impl;

import com.liuyang.spring.dao.UserDao;

public class UserDaoImpl implements UserDao {
    @Override
    public void save() {
        System.out.println("用户保存成功");
    }
}
