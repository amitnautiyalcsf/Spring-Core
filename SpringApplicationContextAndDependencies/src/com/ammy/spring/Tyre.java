package com.ammy.spring;

public class Tyre 
{
	private String brand;

	// for constructor level dependencies
	public Tyre(String brand) {
		super();
		this.brand = brand;
	}

	
	
	
	
	
	public String getBrand() {
		return brand;
	}






	public void setBrand(String brand) {
		this.brand = brand;
	}






	@Override
	public String toString() {
		return "Tyre [brand=" + brand + "]";
	}
	

}
