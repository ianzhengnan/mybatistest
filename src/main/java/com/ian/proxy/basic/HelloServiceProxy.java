package com.ian.proxy.basic;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class HelloServiceProxy implements InvocationHandler {


    private Object target;

    public Object bind(Object target){
        this.target = target;
        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), this);
    }

    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("*********************This is JDK proxy********************");
        Object result = null;

        System.out.println("我准备说hello. ");
        result = method.invoke(target, args);
        System.out.println("我说过hello了");
        return result;
    }
}
