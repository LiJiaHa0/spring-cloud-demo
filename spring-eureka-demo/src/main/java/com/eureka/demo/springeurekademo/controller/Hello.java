package com.eureka.demo.springeurekademo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: 启动测试
 * @Author: JH Lee
 * @Date: 2019/7/5 14:15
 */
@RestController
public class Hello {

    @RequestMapping("/hello")
    public String hello(){
        return "Hello,DH";
    }
}
