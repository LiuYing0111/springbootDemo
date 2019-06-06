package com.springboot.example.springbootdemo.Controller;


import com.springboot.example.springbootdemo.Models.DemoRespo;
import com.springboot.example.springbootdemo.Models.Demodata;
import com.springboot.example.springbootdemo.service.DemoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

//import java.util.ArrayList;
//import java.util.List;

@RestController
public class DemoController{
    @Autowired
    private DemoService service;

//    @Autowired
//    private DemoRespo repo;

    @RequestMapping("/add")
    public Demodata addData() {
        Demodata data = new Demodata();
        data.setId(1l);
        data.setName("Susan");
        data.setSex("女");
        data.setAge(20);

        Demodata demodata = service.create(data);

        return demodata;
    }

//    @RequestMapping("/SearchAll")
//    public List<Demodata> findAll(){
//        Iterable<Demodata> all= repo.findAll();
//        if (all!=null){
//            List<Demodata> result=new ArrayList<Demodata>();
//            for (Demodata item :
//                    all) {
//                result.add(item);
//            }
//            return result;
//        }
//        return null;
//    }
//
//    @RequestMapping("/del")
//    public String del(){
//        repo.deleteById(1L);
//        return "Delete finished";
//    }
//
//    @RequestMapping("/Update")
//    public Demodata update(){
//        Demodata demodata=new Demodata();
////        A.setAge(11);
////        A.(1L);
//        demodata.setName("New Name A");
//        Demodata save = repo.save(demodata);
//
//        return save;
//    }



}