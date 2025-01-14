package com.jsf.sb307externalconfig.service;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @FileName UserServiceMuti
 * @Author JSF
 * @date 2024-12-20
 **/
@Service("userServiceMulti")
public class UserServiceMulti {
    @Value("${spring.datasource.username}")
    private String username;
    @Value("${spring.datasource.password}")
    private String password;
    @Value("${spring.data.redis.host}")
    private String host;
    @Value("${spring.data.redis.port}")
    private String port;

    public void printInfo(){
        String str=String.join(",",username,password,host,port);
        System.out.println(str);
    }
}
