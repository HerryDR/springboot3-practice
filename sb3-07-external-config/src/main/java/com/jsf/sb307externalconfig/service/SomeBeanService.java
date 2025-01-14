package com.jsf.sb307externalconfig.service;

import com.jsf.sb307externalconfig.bean.SomeBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Description
 * @FileName SomeBeanService
 * @Author JSF
 * @date 2024-12-23
 **/
@Service("someBeanService")
public class SomeBeanService {
    @Autowired
    private SomeBean someBean;
    public void printInfo() {
        someBean.doSome();
    }
}
