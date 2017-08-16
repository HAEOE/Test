package com.hae.datasource.controller;

import com.hae.datasource.entity.Demo;
import com.hae.datasource.service.TestService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController

public class TestController {



    @Resource

    private TestService testService;



    @RequestMapping("/list")

    public String test(){

           for(Demo d:testService.getList()){

                  System.out.println(d);

           }

//        for(Demo d:testService.getListByDs1()){
//
//            System.out.println(d);
//
//        }

        return "ok";

    }

    @RequestMapping("/adddemo")
    public String addUser(){
        Demo demo=new Demo();
        demo.setName("薛子豪");
        testService.save(demo);
        return  "nihao";
    }


}
