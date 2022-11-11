package com.tuling.vipspringboot.config;

import org.springframework.boot.context.properties.ConfigurationProperties;

import java.util.Arrays;
import java.util.Map;

/**
 * 注意：在使用@ConfigurationProperties(prefix = "person")  需要在启动类上加上 @EnableConfigurationProperties(value = Person.class)
 */
@ConfigurationProperties(prefix = "person")
public class Person {

    private String name;
    private String age;
    private String sex;
    private String[] pets;
    private String[] cars;
    private Map<String,String> maps;
    private Girlfriend girlfriend;

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                ", sex='" + sex + '\'' +
                ", pets=" + Arrays.toString(pets) +
                ", cars=" + Arrays.toString(cars) +
                ", maps=" + maps +
                ", girlfriend=" + girlfriend +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String[] getPets() {
        return pets;
    }

    public void setPets(String[] pets) {
        this.pets = pets;
    }

    public String[] getCars() {
        return cars;
    }

    public void setCars(String[] cars) {
        this.cars = cars;
    }

    public Map<String, String> getMaps() {
        return maps;
    }

    public void setMaps(Map<String, String> maps) {
        this.maps = maps;
    }

    public Girlfriend getGirlfriend() {
        return girlfriend;
    }

    public void setGirlfriend(Girlfriend girlfriend) {
        this.girlfriend = girlfriend;
    }


}
