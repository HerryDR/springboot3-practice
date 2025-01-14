package com.jsf.sb307externalconfig.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @FileName Uservice
 * @Author JSF
 * @date 2024-11-28
 **/
@Service("userService")
public class UserService {
    @Value("${myapp.username}")
    private String username;
    @Value("${myapp.email}")
    private String email;
    @Value("${myapp.age}")
    private Integer age;
    @Value("${myapp.address:翻斗花园}")
    private String address;


    public void printInfo(){
        String str = String.join(",", username, email, String.valueOf(age),address);
        System.out.println(str);
    }
}
