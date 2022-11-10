package com.tuling.vipspringboot01;

import com.tuling.vipspringboot01.config.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = Person.class)
public class VipSpringboot01Application {

    public static void main(String[] args) {
        SpringApplication.run(VipSpringboot01Application.class, args);
    }

}
