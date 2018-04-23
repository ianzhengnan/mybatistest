package com.ian.proxy.basic;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class HelloServiceCglib implements MethodInterceptor {

    private Object target;

    // cglib继承方式生成代理
    public Object getInstance(Object target){
        this.target = target;
        Enhancer enhancer = new Enhancer();
        enhancer.setSuperclass(this.target.getClass());
        // 回调方法
        enhancer.setCallback(this);
        return enhancer.create();
    }

    public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {

        System.err.println("############This is CGLIB proxy###############");
        System.err.println("我准备说hello");
        Object resultObj = proxy.invokeSuper(obj, args);
        System.err.println("我说过hello了");

        return resultObj;
    }
}
