package com.example.dddtest;

import lombok.Value;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(value={"com.example.dddtest.domain.**.mapper"})
public class DddtestApplication {

    public static void main(String[] args) {
        SpringApplication.run(DddtestApplication.class, args);
    }

}
