package com.eastsea.quoteservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 测试调用 test-service 的服务
 *
 * @Author zhongyan
 * @Date 2019/9/25 17:26
 */
@RestController
@RequestMapping("/v1/restful")
public class TestQuoteController {
    @Autowired
    private RestTemplate restTemplate;

    @RequestMapping("/hello")
    @GetMapping
    public String hello() {
        // test-service 是调用注册中心里的名字， hello 是 url 后缀
        String msg = restTemplate.getForEntity("http://test-service/hello", String.class).getBody();
        return msg + "\r\n hello quote-service ! ";
    }
}
