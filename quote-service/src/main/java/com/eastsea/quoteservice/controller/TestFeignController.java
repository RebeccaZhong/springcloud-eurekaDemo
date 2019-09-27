package com.eastsea.quoteservice.controller;

import com.eastsea.quoteservice.domain.service.TestQuoteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * 测试调用 test-service 的服务
 *
 * @Author zhongyan
 * @Date 2019/9/25 17:26
 */
@RestController
@RequestMapping("/v1/feign")
public class TestFeignController {
    @Autowired
    private TestQuoteService quoteService;

    @RequestMapping(method = RequestMethod.GET, value = "/hello", produces = {"application/json;charset=UTF-8"})
    public String hello() {
        return quoteService.findAll();
    }

    @RequestMapping(method = RequestMethod.GET, value = "/hello2")
    public String hello2() {
        return "hello world";
    }
}
