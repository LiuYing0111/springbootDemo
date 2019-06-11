package com.springboot.example.springbootdemo.Controller;


import com.springboot.example.springbootdemo.Models.Demodata;
import com.springboot.example.springbootdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class DemoController{
    @Autowired
    private DemoService service;

    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public Demodata addData(@RequestBody Demodata demo) {

        if (demo.getAge() < 0) {
            System.err.println("年龄不能是负数。。。。。");
        }

        Demodata demodata = service.create(demo);

        return demodata;
    }

}