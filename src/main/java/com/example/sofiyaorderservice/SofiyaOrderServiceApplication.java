package com.example.sofiyaorderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SofiyaOrderServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SofiyaOrderServiceApplication.class, args);
    }

}
