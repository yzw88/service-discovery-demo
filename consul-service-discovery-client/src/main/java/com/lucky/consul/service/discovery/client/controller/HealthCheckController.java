package com.lucky.consul.service.discovery.client.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Slf4j
public class HealthCheckController {

    /**
     * 当配置文件中存在register-health-check: true时，
     * consul会一直给所注册的服务发送/health请求，用以确认服务的存活。
     *
     * @return String
     */
    @GetMapping("/health")
    public String healthCheck() {
        log.info("健康检查 start======");
        return "health";
    }
}
