package com.example.junitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
public class JunitdemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(JunitdemoApplication.class, args);
    }

}
