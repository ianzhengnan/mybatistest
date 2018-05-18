package com.ian.mb.basic;

public class HelloServiceTest {

	public static void main(String[] args) {
		
		HelloServiceProxy helloHandler = new HelloServiceProxy();
		HelloService proxy = (HelloService)helloHandler.bind(new HelloServiceImpl());
		proxy.sayHello("李四");
		
		HelloServiceCglib cglibHandler = new HelloServiceCglib();
		
		HelloService proxy2 = (HelloService)cglibHandler.getInstance(new HelloServiceImpl());
		proxy2.sayHello("王五");
		
	}
	
	public void main(String test, String test1) {
		
	}
	
	public void main(String test, int test1) {
	
	}
}
