package com.atguigu.spring;

import com.atguigu.spring.bean.User;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
@MapperScan("com.atguigu.spring.dao")
@SpringBootApplication
public class SpringbootAutoApplication {

    public static void main(String[] args) {


        ConfigurableApplicationContext run = SpringApplication.run(SpringbootAutoApplication.class, args);
        User user = (User) run.getBean("user");
        System.out.println(user);

    }





}
