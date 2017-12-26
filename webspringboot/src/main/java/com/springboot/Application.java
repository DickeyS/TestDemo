package com.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = TestProperties.class)
public class Application {


    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class,args);
    }
}
