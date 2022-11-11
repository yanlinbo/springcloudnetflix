package com.tuling.vipspringboot.controller;

import com.tuling.vipspringboot.config.Person;
import com.tuling.vipspringboot.exception.TulingException;
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

    @RequestMapping("/testTuling")
    public String testTuling() {
        return "testTuling";
    }

    @RequestMapping("/testError")
    public TulingException testError() {
        return new TulingException(100,"用户不存在");
    }
}
