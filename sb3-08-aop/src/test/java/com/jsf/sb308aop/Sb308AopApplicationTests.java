package com.jsf.sb308aop;

import com.jsf.sb308aop.service.OrderService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb308AopApplicationTests {

    @Autowired
    private OrderService orderService;
    @Test
    void contextLoads() {
        orderService.generate(1,"jsf");
        orderService.detail(1);
    }

}
