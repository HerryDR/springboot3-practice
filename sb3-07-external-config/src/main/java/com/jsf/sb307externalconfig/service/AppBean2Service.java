package com.jsf.sb307externalconfig.service;

import com.jsf.sb307externalconfig.bean.AppBean2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @FileName AppBean2Service
 * @Author JSF
 * @date 2024-12-20
 **/
@Service("appBean2Service")
public class AppBean2Service {
    @Autowired
    private AppBean2 appBean2;

    public void printInfo() {
        System.out.println(appBean2);
    }
}
