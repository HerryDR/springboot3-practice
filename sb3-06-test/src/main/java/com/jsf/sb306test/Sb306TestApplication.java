package com.jsf.sb306test;

import com.jsf.sb306test.service.UserService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class Sb306TestApplication {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = SpringApplication.run(Sb306TestApplication.class, args);
		UserService userService = applicationContext.getBean(UserService.class);
		userService.save();
	}

}
