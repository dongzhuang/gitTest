package com.dong.gittest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.LocalTime;

@SpringBootApplication
public class GittestApplication {

    public static void main(String[] args) {
        SpringApplication.run(GittestApplication.class, args);
        System.out.println("我是git");
        System.out.println("第一行");
        System.out.println("我是分支");
        LocalTime now = LocalTime.now();
        System.out.println(now);
    }

}
