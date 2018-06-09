package com.ian.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class SpringReading {

	private static ApplicationContext applicationContext;
	
	public static void main(String[] args) {
		applicationContext = new ClassPathXmlApplicationContext("source-reading.xml");
		
		DemoServiceImpl dServiceImpl = (DemoServiceImpl)applicationContext.getBean("demoService");
		
		System.out.println(dServiceImpl.toString());
		
	}
	
}
