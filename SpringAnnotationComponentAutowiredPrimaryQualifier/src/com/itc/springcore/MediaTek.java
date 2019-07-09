package com.itc.springcore;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
// @Primary// takes this one into consideration not Snapdragon
public class MediaTek implements MobileProcessor {

	@Override
	public void process() {
		System.out.println("2nd best");
		
	}
	

}
