package com.eureka.demo.springeurekademo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringEurekaDemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringEurekaDemoApplication.class, args);
    }

}
