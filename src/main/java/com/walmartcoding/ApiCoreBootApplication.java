package com.walmartcoding;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
public class ApiCoreBootApplication {
    public static void main (String[] args){
        SpringApplication.run(ApiCoreBootApplication.class, args);
    }
}
