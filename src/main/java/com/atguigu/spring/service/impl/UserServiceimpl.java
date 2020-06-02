package com.atguigu.spring.service.impl;

import com.atguigu.spring.bean.User;
import com.atguigu.spring.dao.UserDao;
import com.atguigu.spring.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceimpl implements UserService {
@Autowired
    UserDao  userDao;

    @Override
    public List<User> findAll() {
        return null;
    }
}
