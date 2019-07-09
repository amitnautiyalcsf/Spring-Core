package com.itc.springcore;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;


@Component //Non qualified and De captitalized 

public class Samsung 
{
	@Autowired // for searching of the object itself
	@Qualifier("snapDragon")// instead of primary annotation we can also use this by defining the type of object we need.
	MobileProcessor cpu;
	
	
	
	public MobileProcessor getCpu() {
		return cpu;
	}



	public void setCpu(MobileProcessor cpu) {
		this.cpu = cpu;
	}



	public void config()
	{
		System.out.println("This is OctaCore, 8gb ram,24MP camera");
		cpu.process();
		
	}

}
