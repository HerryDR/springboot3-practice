package com.jsf.sb307externalconfig;

import com.jsf.sb307externalconfig.bean.AppBean2;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationPropertiesScan;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.ImportResource;

@SpringBootApplication
//@EnableConfigurationProperties(AppBean2.class)
@ConfigurationPropertiesScan("com.jsf.sb307externalconfig.bean")
@ImportResource("classpath:applicationContext.xml")
public class Sb307ExternalConfigApplication {
	public static void main(String[] args) {
		SpringApplication.run(Sb307ExternalConfigApplication.class, args);
	}

}
