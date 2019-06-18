package com.springboot.example.springbootdemo.Models;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Demodata {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
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
//test
    public void setAge(int age) {
        this.age = age;
    }
}
