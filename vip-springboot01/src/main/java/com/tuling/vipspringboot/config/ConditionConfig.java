package com.tuling.vipspringboot.config;

import com.tuling.vipspringboot.condition.TulingAspect;
import com.tuling.vipspringboot.condition.TulingConditonal;
import com.tuling.vipspringboot.condition.TulingLog;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Conditional;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConditionConfig {

    @Bean
    public TulingAspect getTulingAspect(){
        System.out.println("tulingAspect组件自动装配道容器中");
        return  new TulingAspect();
    }

    @Conditional(value = TulingConditonal.class)
    @Bean
    public TulingLog getTulingLog(){
        System.out.println("TulingLog组件自动装配道容器中");
        return  new TulingLog();
    }
}
