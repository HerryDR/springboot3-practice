package com.jsf.springboot3.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description
 * @FileName MyController
 * @Author JSF
 * @date 2024-11-28
 **/
//@Controller
@RestController
public class MyController {
    @RequestMapping("/hello")
    public String index(){
        return "Hello World";
    }
}
