package com.jsf.sb306test.service.impl;

import com.jsf.sb306test.service.UserService;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @FileName UserServiceImpl
 * @Author JSF
 * @date 2024-11-28
 **/
@Service("userService")
public class UserServiceImpl implements UserService {
    @Override
    public void save() {
        System.out.println("save...");
    }
}
