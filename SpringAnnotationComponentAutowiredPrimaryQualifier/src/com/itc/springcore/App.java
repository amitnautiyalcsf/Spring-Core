package com.itc.springcore;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

	public static void main(String[] args) 
	{
		ApplicationContext factory= new AnnotationConfigApplicationContext(Config.class);
		Samsung s7 = factory.getBean(Samsung.class);
		s7.config();
	}
}
