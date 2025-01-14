package com.jsf.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Springboot315AutoConfigurationApplication {

    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Springboot315AutoConfigurationApplication.class, args);
        String[] beanDefinitionNames = applicationContext.getBeanDefinitionNames();
        for(String beanDefinitionName : beanDefinitionNames){
            if("a".equals(beanDefinitionName)){
                System.out.println(beanDefinitionName);
            } else if ("b".equals(beanDefinitionName)) {
                System.out.println(beanDefinitionName);
            }
        }
        applicationContext.close();
    }
}
