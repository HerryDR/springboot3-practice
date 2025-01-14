package com.jsf.sb308aop.service.impl;

import com.jsf.sb308aop.service.OrderService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @FileName OrderServiceImpl
 * @Author JSF
 * @date 2024-12-23
 **/
@Service("orderService")
public class OrderServiceImpl implements OrderService {
    @Override
    public void generate(Integer id,String name) {
        System.out.println("生成订单");
    }

    @Override
    public void detail(Integer id) {
        System.out.println("订单详情");
    }
}
