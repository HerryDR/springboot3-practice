package com.jsf.sb307externalconfig.bean;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

/**
 * @Description
 * @FileName SomeBean
 * @Author JSF
 * @date 2024-12-23
 **/
@Component
public class SomeBean {
    @Autowired
    private Environment environment;
    public void doSome(){
        String[] activateProfiles = environment.getActiveProfiles();
        for(String profile:activateProfiles){
            System.out.println(profile);
        }
        String street=environment.getProperty("app2.address.street");
        System.out.println(street);
    }
}
