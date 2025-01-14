package com.jsf.sb305core.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @FileName HelloController
 * @Author JSF
 * @date 2024-11-28
 **/
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello(){
        return "hello5";
    }
}
