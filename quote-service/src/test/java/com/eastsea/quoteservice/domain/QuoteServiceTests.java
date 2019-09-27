package com.eastsea.quoteservice.domain;

import com.eastsea.quoteservice.QuoteServiceApplication;
import com.eastsea.quoteservice.domain.service.TestQuoteService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = QuoteServiceApplication.class)
public class QuoteServiceTests {
    @Autowired
    private TestQuoteService quoteService;

    @Test
    public void contextLoads() throws Exception {
        String msg = quoteService.findAll();
        System.out.println(msg);
    }

}
