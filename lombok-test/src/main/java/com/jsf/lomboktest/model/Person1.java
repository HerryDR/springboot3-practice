package com.jsf.lomboktest.model;

import lombok.Builder;
import lombok.Data;
import lombok.Singular;

import java.util.List;

/**
 * @Description
 * @FileName Person1
 * @Author JSF
 * @date 2024-12-25
 **/
@Data
@Builder
public class Person1 {
    private final String name;
    private final int age;
    private final String email;
    @Singular("addPhone")
    private final List<String> phones;
}
