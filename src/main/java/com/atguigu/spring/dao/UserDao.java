package com.atguigu.spring.dao;

import com.atguigu.spring.bean.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Mapper//由mabatis框架管理
@Repository//接口由IOC容器管理  陪着扫描
public interface UserDao {

    public List<User> findAll();
}
