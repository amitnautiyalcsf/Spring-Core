package com.ammy.spring;

import org.springframework.stereotype.Component;

@Component
public class Tyre 
{
	private String brand;

	// for constructor level dependencies

	
//	public Tyre(String brand) {
//		super();
//		this.brand = brand;
//	}

	
	
	public String getBrand() {
		return brand;
	}

 
	// for setter injection
	public void setBrand(String brand) {
		this.brand = brand;
	}






	@Override
	public String toString() {
		return " Its Working";
	}
	

}
