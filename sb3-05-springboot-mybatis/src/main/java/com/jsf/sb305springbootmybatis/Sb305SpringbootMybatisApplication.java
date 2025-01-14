package com.jsf.sb305springbootmybatis;

import com.jsf.sb305springbootmybatis.model.Vip;

import com.jsf.sb305springbootmybatis.repository.VipMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import java.util.List;

@SpringBootApplication
@MapperScan(basePackages = {"com.jsf.sb305springbootmybatis.repository"})
public class Sb305SpringbootMybatisApplication {
    public static void main(String[] args) {
        ConfigurableApplicationContext applicationContext = SpringApplication.run(Sb305SpringbootMybatisApplication.class, args);
        VipMapper vipMapper = applicationContext.getBean("vipMapper", VipMapper.class);
        Vip vip=vipMapper.selectById(1L);
        System.out.println(vip);

        /*Vip newVip=new Vip("jack","123456789", "1999-01-01");
        vipMapper.insert(newVip);*/

        /*List<Vip> vips=vipMapper.selectAll();
        System.out.println(vips);*/

        /*vip.setName("zhangsan");
        vipMapper.update(vip);
        List<Vip> vips=vipMapper.selectAll();
        System.out.println(vips);*/

        vipMapper.deleteById(3L);
        List<Vip> vips=vipMapper.selectAll();
        System.out.println(vips);

        applicationContext.close();

    }
}
