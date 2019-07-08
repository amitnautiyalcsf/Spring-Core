package com.ammy.spring;

import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle
{
	
	public void drive()
	{
		
		System.out.println("Ninja bikes are Awesome");
		
	}

}
