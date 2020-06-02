package com.atguigu.spring.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Value("${person.name}")/*取值赋给私有属性*/
    private String name;

    @Value("${person.age}")
    private Integer age;


   // @RequestMapping(value = "/hello")
    @GetMapping("/hello")
    public  String  hello(){

        System.out.println(name);
        System.out.println(age);


        return "name"+name+"age"+age;
    }






}
