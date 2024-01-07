package com.woomin.main;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import com.woomin.beans.Restaurant;
import com.woomin.config.BeanConfigClass;

public class MainClass {

	public static void main(String[] args) {
		
		AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(BeanConfigClass.class);
		
		Restaurant restaurant = ctx.getBean(Restaurant.class);
		restaurant.serveDish();
		
		ctx.close();
		
	}
}
