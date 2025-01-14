package com.jsf.lomboktest;

import com.jsf.lomboktest.model.Customer;
import com.jsf.lomboktest.model.Person;
import com.jsf.lomboktest.model.Person1;
import com.jsf.lomboktest.model.User;

/**
 * @Description
 * @FileName Test
 * @Author JSF
 * @date 2024-12-25
 **/
public class Test {
    public static void main(String[] args) {
        /*User user=new User();
        user.setName("啊啊啊");
        System.out.println(user.getName());
        System.out.println(user.toString());
        System.out.println(user.hashCode());
        User user1=new User();
        user1.setName("啊啊啊");
        System.out.println(user.equals(user1));*/

        /*Customer customer=new Customer(1L,"甲","123456");
        System.out.println(customer);
        System.out.println(customer.getId());
        System.out.println(customer.getName());
        System.out.println(customer.getPassword());
        Customer customer1=new Customer(1L,"甲","123456");
        System.out.println(customer.equals(customer1));*/

        /*Person person=Person.builder()
                .name("乙")
                .age(3)
                .email("123@qq.com")
                .build();
        System.out.println(person);*/

        /*Person1 person1=Person1.builder()
                .name("丙")
                .age(4)
                .email("456@qq.com")
                .build();
        System.out.println(person1);*/

        Person1 person1=Person1.builder()
                .name("丙")
                .age(4)
                .email("456@qq.com")
                .addPhone("123")
                .addPhone("456")
                .addPhone("789")
                .build();
        System.out.println(person1);
    }
}
