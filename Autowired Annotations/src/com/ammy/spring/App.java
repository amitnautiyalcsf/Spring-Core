package com.ammy.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	public static void main(String[] args) {
	
		//BeanFactory   //for small application 'Beanfactory' is good choice 
		//ApplicationContext // for Large Enterprise Application 'ApplicationContext' is better
		

		ApplicationContext context= new ClassPathXmlApplicationContext("ex.xml");

		

//		Tyre t = (Tyre) context.getBean("tyre");
//		System.out.println(t);

		
		Car obj = (Car) context.getBean("car");
		obj.drive();
		
	}

}
