package com.springboot.example.springbootdemo.dto;

import org.springframework.stereotype.Component;

@Component
public class DemoDto {
    Long id;
    public Long getId(){

        return id;
    }
    public void setId(Long id){
        this.id=id;

    }
    private String name;

    public String getName() {

        return name;
    }

    public void setName(String name) {

        this.name = name;
    }
    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
    private int age;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
