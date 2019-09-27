package com.eastsea.quoteservice.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Component
@FeignClient("test-service")
public interface TestFeignClient {

    @RequestMapping(method = RequestMethod.GET, value = "/hello")
    String hello();
}
