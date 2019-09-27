package com.eastsea.testservice.controller;

import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@EnableEurekaClient
@RestController
public class TestController {

    @RequestMapping("/hello")
    @GetMapping
    public String hello() {
        return "hello test-service !";
    }
}
