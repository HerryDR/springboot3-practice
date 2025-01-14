package com.jsf.sb307ssm.controller;

import com.jsf.sb307ssm.model.Vip;
import com.jsf.sb307ssm.service.VipService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @FileName VipController
 * @Author JSF
 * @date 2024-12-25
 **/
@RestController
public class VipController {
    @Autowired
    private VipService vipService;

    @GetMapping("/vip/{id}")
    public Vip detailById(@PathVariable("id") Long id){
        return vipService.getById(id);
    }
}
