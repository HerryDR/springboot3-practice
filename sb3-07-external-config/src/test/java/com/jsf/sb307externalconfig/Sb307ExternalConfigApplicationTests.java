package com.jsf.sb307externalconfig;

import com.jsf.sb307externalconfig.bean.AppBean;
import com.jsf.sb307externalconfig.bean.Person;
import com.jsf.sb307externalconfig.service.*;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Sb307ExternalConfigApplicationTests {

	@Autowired
	private UserService userService;
	@Test
	void contextLoads() {
		userService.printInfo();
	}

	@Autowired
	private UserServiceMulti userServiceMulti;
	@Test
	void multiConfig() {
		userServiceMulti.printInfo();
	}

	@Autowired
	private AppBean appBean;
	@Test
	void getApp(){
		System.out.println(appBean);
	}

	@Autowired
	private AppBean2Service appBean2Service;
	@Test
	void getApp2(){
		appBean2Service.printInfo();
	}

	@Autowired
	private CollectionConfigService collectionConfigService;
	@Test
	void getCollectionConfig(){
		collectionConfigService.printInfo();
	}

	@Autowired
	private ApplicationConfigService applicationConfigService;
	@Test
	void getApplicationConfig(){
		applicationConfigService.printInfo();
	}

	@Autowired
	private GroupService groupService;
	@Test
	void getGroup(){
		groupService.printInfo();
	}

	@Autowired
	private Person person;
	@Test
	void getPerson(){
		System.out.println(person);
	}

	@Autowired
	private SomeBeanService someBeanService;
	@Test
	void getSomeBean(){
		someBeanService.printInfo();
	}
}
