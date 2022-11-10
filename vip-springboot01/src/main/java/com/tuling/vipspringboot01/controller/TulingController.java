package com.tuling.vipspringboot01.controller;

import com.tuling.vipspringboot01.config.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TulingController {

    @Autowired
    private Person person;

    @RequestMapping("/tuling")
    public String tulingHelloWorld() {
        System.out.println("person是： "+person.toString());
        return "tuling,hello";
    }
}
