package com.ian.proxy.basic;

public class HelloServiceTest {

    public static void main(String[] args) {

        HelloServiceProxy helloHandler = new HelloServiceProxy();
        HelloService proxy = (HelloService)helloHandler.bind(new HelloServiceImpl());
        proxy.sayHello("李四");
    }
}
