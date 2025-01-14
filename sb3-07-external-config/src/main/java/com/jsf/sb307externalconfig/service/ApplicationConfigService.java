package com.jsf.sb307externalconfig.service;

import com.jsf.sb307externalconfig.bean.ApplicationConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @FileName ApplicationConfigService
 * @Author JSF
 * @date 2024-12-23
 **/
@Service("applicationConfigService")
public class ApplicationConfigService {
    @Autowired
    private ApplicationConfig applicationConfig;
    public void printInfo() {
        System.out.println(applicationConfig.getAddress());
    }
}
