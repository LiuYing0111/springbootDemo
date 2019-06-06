package com.springboot.example.springbootdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringbootdemoApplication {

    public static void main(String[] args) {

        System.out.println("代码正在运行...");
        SpringApplication.run(SpringbootdemoApplication.class, args);

    }

}
