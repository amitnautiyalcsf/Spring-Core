package com.ammy.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;



@Component
public class Car implements Vehicle 
{
//	@Autowired
//	private Tyre tyre;
	public void drive()
	{
		System.out.println("Having an awesome Speed and splended model of lambo");
		//System.out.println("Car" + tyre);
	}

}
