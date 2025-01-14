package com.jsf.lomboktest.model;

import lombok.Value;

/**
 * @Description
 * @FileName Customer
 * @Author JSF
 * @date 2024-12-25
 **/
@Value
public class Customer {
    Long id;
    String name;
    String password;
}
