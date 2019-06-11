package com.springboot.example.springbootdemo.service;

import com.springboot.example.springbootdemo.Models.DemoRespo;
import com.springboot.example.springbootdemo.Models.Demodata;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class DemoService {
    @Autowired
    private DemoRespo repo;

    public Demodata create(Demodata demodata){

        return repo.save(demodata);
    }


}

