package com.jsf.sb307externalconfig.bean;

/**
 * @Description
 * @FileName Vip
 * @Author JSF
 * @date 2024-12-20
 **/
public class Vip {
    private String name;

    private Integer age;

    @Override
    public String toString() {
        return "Vip{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
