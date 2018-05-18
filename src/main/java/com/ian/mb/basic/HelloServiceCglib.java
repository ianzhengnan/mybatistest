package com.ian.mb.basic;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

public class HelloServiceCglib implements MethodInterceptor{

	private Object target;
	
	public Object getInstance(Object target) {
		this.target = target;
		Enhancer enhancer = new Enhancer();
		enhancer.setSuperclass(target.getClass());
		// callback
		enhancer.setCallback(this);
		// create proxy 
		return enhancer.create();
	}
	
	
	public Object intercept(Object obj, Method method, Object[] args, MethodProxy proxy) throws Throwable {
		System.err.println("#############这里是CGLIB动态代理##############");
		System.err.println("我准备说hello");
		Object returnObject = proxy.invokeSuper(obj, args);
		System.err.println("我说过hello了");
		return returnObject;
	}

	
}
