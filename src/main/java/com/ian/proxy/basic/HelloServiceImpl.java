package com.ian.proxy.basic;

public class HelloServiceImpl implements HelloService {
    public void sayHello(String name) {
        System.out.println("Hello " + name);
    }
}
