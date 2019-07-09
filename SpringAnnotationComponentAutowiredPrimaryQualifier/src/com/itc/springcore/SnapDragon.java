package com.itc.springcore;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component //it is for the Object or a class Object

public class SnapDragon implements MobileProcessor
{

	public void process() {
		
		System.out.println("World's Best CPU");
		
		
	}
	

}
