package com.jsf.springboot.config;

import com.jsf.springboot.bean.A;
import com.jsf.springboot.bean.B;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @Description
 * @FileName AppConfig
 * @Author JSF
 * @date 2025-01-10
 **/
@Configuration
public class AppConfig {
    @Bean
    public A a(){
        return new A();
    }

    @ConditionalOnMissingBean(A.class)
    @Bean
    public B b(){
        return new B();
    }

}
