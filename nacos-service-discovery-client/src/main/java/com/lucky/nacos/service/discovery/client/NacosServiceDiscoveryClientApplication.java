package com.lucky.nacos.service.discovery.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class NacosServiceDiscoveryClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(NacosServiceDiscoveryClientApplication.class, args);
    }

}
