package com.jsf.sb307externalconfig.bean;

/**
 * @Description
 * @FileName Persoon
 * @Author JSF
 * @date 2024-12-23
 **/
public class Person {
    private String name;
    private Integer age;

    @Override
    public String toString() {
        return "Persoon{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
