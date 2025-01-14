package com.jsf.lomboktest.service;

import lombok.extern.slf4j.Slf4j;

/**
 * @Description
 * @FileName UserService
 * @Author JSF
 * @date 2024-12-25
 **/
@Slf4j
public class UserService {
    public void login(){
        log.info("登录中……");
    }
    public static void main(String[] args) {
        UserService userService=new UserService();
        userService.login();
    }
}
