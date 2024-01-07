package com.woomin.beans;

import org.springframework.stereotype.Component;

@Component
public class ChickenChef implements Chef{

	@Override
	public void cook() {
		System.out.println("치킨을 요리합니다.");
		
	}

	
}
