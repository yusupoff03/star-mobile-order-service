package com.example.sofiyaorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
//@EnableAutoConfiguration(exclude = {
//        org.springframework.cloud.netflix.eureka.EurekaClientAutoConfiguration.class
//})
public class SofiyaOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofiyaOrderServiceApplication.class, args);
    }

}
