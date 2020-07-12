package com.ssi;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DemoUser {

	public static void main(String[] args) {
//
		//this class needs an instance of Demo
		
		/*
		//approach-1	(create it yourself)
		Demo d1=new Demo();
		//d1.setX(10);
		//d1.setY(20);
		System.out.println(d1);
		*/
		
		//approach-2 	(outsource this to spring framework)
		
		//you need an IoC Container
		
		ApplicationContext context=new ClassPathXmlApplicationContext("spring.xml");		//we are creating an IocContainer
		Demo ob=(Demo)context.getBean("d2");
		//ob.setX(11); ob.setY(21);
		System.out.println(ob);
		
		

	}

}
