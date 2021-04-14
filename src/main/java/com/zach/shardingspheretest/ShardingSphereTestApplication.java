package com.zach.shardingspheretest;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.zach.shardingspheretest.mapper")
public class ShardingSphereTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ShardingSphereTestApplication.class, args);
    }

}
