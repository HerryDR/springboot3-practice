package com.jsf.springboot;

import com.jsf.springboot.model.TVip;
import com.jsf.springboot.repository.TVipMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@MapperScan("com.jsf.springboot.repository")
public class Sb306SpringbootMybatisGeneratorApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(Sb306SpringbootMybatisGeneratorApplication.class, args);
		TVipMapper vipMapper = applicationContext.getBean("TVipMapper",TVipMapper.class);
		/*// 增
		TVip vip = new TVip();
		vip.setName("孙悟空");
		vip.setBirth("1999-11-11");
		vip.setCardNumber("1234567894");
		vipMapper.insert(vip);*/
		// 查一个
		TVip vip1 = vipMapper.selectByPrimaryKey(2L);
		System.out.println(vip1);
		/*// 改
		vip1.setName("孙行者");
		vipMapper.updateByPrimaryKey(vip1);
		// 删
		vipMapper.deleteByPrimaryKey(1L);*/

		// 获取所有 Bean 的名称
		String[] beanNames = applicationContext.getBeanNamesForType(TVipMapper.class);
		for (String beanName : beanNames) {
			System.out.println("Mapper Bean 名称: " + beanName);
		}
		// 关闭Spring容器
		applicationContext.close();
	}

}
