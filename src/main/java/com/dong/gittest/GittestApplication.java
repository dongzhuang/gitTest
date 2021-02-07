package com.dong.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GittestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GittestApplication.class, args);
        System.out.println("我是git");
        System.out.println("第一行");
        System.out.println("我是分支");
    }

}
