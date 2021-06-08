package com.huyuya;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.huyuya.mapper")
public class Springboot06SecurityApplication {

    public static void main(String[] args) {
        SpringApplication.run(Springboot06SecurityApplication.class, args);
    }

}
