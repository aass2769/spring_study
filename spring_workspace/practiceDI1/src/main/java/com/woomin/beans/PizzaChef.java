package com.woomin.beans;

import org.springframework.stereotype.Component;

@Component
public class PizzaChef implements Chef{

	@Override
	public void cook() {
		System.out.println("피자를 요리합니다.");
	}

}
