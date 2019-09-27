package com.eastsea.quoteservice.domain.service.impl;

import com.eastsea.quoteservice.domain.service.TestQuoteService;
import com.eastsea.quoteservice.feign.TestFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * TODO
 *
 * @Author zhongyan
 * @Date 2019/9/25 17:39
 */
@Service
public class TestQuoteServiceImpl implements TestQuoteService {
    @Autowired
    private TestFeignClient feignClient;

    public String findAll() {
        return "Feign: " + feignClient.hello();
    }
}
