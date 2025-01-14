package com.jsf.sb3;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import javax.xml.crypto.Data;
import java.util.Date;


@SpringBootApplication
public class Sb304UseIdeaPluginApplication {
	@Bean
	public Date getDate() {
		return new Date() ;
	}
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Sb304UseIdeaPluginApplication.class, args);
		Date dateBean1 = applicationContext.getBean(Date.class);
		System.out.println(dateBean1);
		Date dateBean2 = applicationContext.getBean("getDate",Date.class);
		System.out.println(dateBean2);
	}

}
