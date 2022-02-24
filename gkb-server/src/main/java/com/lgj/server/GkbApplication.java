package com.lgj.server;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.lgj.server.mapper")
public class GkbApplication {
    
    public static void main(String[] args) {
        SpringApplication.run(GkbApplication.class,args);
    }
}
