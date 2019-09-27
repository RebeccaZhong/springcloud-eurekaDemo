package com.eastsea.eurekaserver.configure;

import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

/**
 * 启用web页面登录机制
 *
 * @Author zhongyan
 * @Date 2019/9/26 10:41
 */
@EnableWebSecurity
public class WebSecurityConfigurer extends WebSecurityConfigurerAdapter {

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        //为了支持http://eastsea:123456@127.0.0.1:8761/eureka/这种认证方式，需启用httpBasic
        http.authorizeRequests().anyRequest().authenticated().and().csrf().disable().httpBasic();
    }
}
