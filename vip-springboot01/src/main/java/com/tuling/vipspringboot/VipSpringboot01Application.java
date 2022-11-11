package com.tuling.vipspringboot;

import com.tuling.vipspringboot.config.Person;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(value = Person.class)
//extends SpringBootServletInitializer
public class VipSpringboot01Application {

    public static void main(String[] args) {
        SpringApplication.run(VipSpringboot01Application.class, args);
    }

//    @Override
//    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
//        return application.sources(VipSpringboot01Application.class);
//    }

}
