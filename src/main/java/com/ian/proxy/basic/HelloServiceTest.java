package com.ian.proxy.basic;

public class HelloServiceTest {

    public static void main(String[] args) {

        // jdk 反射
        HelloServiceProxy helloHandler = new HelloServiceProxy();
        HelloService proxy = (HelloService)helloHandler.bind(new HelloServiceImpl());
        proxy.sayHello("李四");
        // cglib 反射
        HelloServiceCglib cglibHandler = new HelloServiceCglib();
        HelloService proxy2 = (HelloService)cglibHandler.getInstance(new HelloServiceImpl());
        proxy2.sayHello("张三");

    }
}
