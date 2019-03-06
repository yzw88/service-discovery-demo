package com.lucky.consul.service.discovery.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ConsulServiceDiscoveryClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(ConsulServiceDiscoveryClient01Application.class, args);
    }

}
