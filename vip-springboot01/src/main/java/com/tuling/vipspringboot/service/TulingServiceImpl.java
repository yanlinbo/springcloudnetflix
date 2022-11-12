package com.tuling.vipspringboot.service;

public class TulingServiceImpl {
    public TulingServiceImpl() {
        System.out.println("我是通过ImportSelector 导入来的组件=========");
    }

    public String test(){
        return "yanlinbo test";
    }
}
