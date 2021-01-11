package com.huang.dp;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.huang.dp.dao")
@SpringBootApplication
public class DpApplication {
    public static void main(String[] args) {
        SpringApplication.run(DpApplication.class, args);
    }
}
