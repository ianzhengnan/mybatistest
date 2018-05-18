package com.ian.mb.basic;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class ReflectService {

	public void sayHi(String name) {
		System.out.println("Hello " + name);
	}
	
	public static void main(String[] args) throws ClassNotFoundException
		, InstantiationException, IllegalAccessException, NoSuchMethodException
		, SecurityException, IllegalArgumentException, InvocationTargetException {
		
		Class clazz = Class.forName(ReflectService.class.getName());
		
		System.out.println(ReflectService.class.getName());
		
		Object service = clazz.newInstance();
		
		Method method = service.getClass().getMethod("sayHi", String.class);
		
		method.invoke(service, "张三");
		
	}
}
