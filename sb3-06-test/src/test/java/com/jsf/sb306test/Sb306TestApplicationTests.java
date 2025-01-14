package com.jsf.sb306test;

import com.jsf.sb306test.service.UserService;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb306TestApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	void contextLoads() {
		userService.save();
	}

}
