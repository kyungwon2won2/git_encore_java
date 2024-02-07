package com.encore.tv.domain;

import com.encore.tv.util.TV;

public class SamsungTV implements TV {
	
	public SamsungTV() {
		
	}
	
	@Override
	public void turnOn() {
		System.out.println("STV powerOn");
	}


}
