package com.atguigu.spring.config;

import com.atguigu.spring.bean.User;
import org.springframework.boot.SpringBootConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootConfiguration
public class AppConfig {
    @Bean//声明Bean对象
    public User user2(){
        return new User();
    }

}
