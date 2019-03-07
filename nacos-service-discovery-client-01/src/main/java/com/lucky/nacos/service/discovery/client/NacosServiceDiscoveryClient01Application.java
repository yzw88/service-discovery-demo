package com.lucky.nacos.service.discovery.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosServiceDiscoveryClient01Application {

    public static void main(String[] args) {
        SpringApplication.run(NacosServiceDiscoveryClient01Application.class, args);
    }

}
