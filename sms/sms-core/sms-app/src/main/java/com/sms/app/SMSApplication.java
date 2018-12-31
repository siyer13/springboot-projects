package com.sms.app;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
@ComponentScan(basePackages = {"com.sms.util", "com.sms.resource"})
public class SMSApplication {
    public static void main(String[] args) {
        SpringApplication.run(SMSApplication.class, args);
    }
}
