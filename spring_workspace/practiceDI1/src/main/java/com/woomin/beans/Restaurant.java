package com.woomin.beans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class Restaurant {

	private Chef chef;
	
	@Autowired
	public Restaurant(@Qualifier("chickenChef")Chef chef) {
		
		this.chef = chef;
	}

	public Chef getChef() {
		return chef;
	}

	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void serveDish() {
		chef.cook();
	}
}
