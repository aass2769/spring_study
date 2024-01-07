package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		//id가 test1인 bean 객체의 주소값을 받아온다.
		TestBean t1 = (TestBean) ctx.getBean("test1");
		System.out.println(t1);
		
		TestBean t2 = ctx.getBean("test1", TestBean.class);
		System.out.println(t2);
		
		//id가 test2인 bean 객체의 주소값을 받아온다.
		TestBean t3 = ctx.getBean("test2", TestBean.class);
		System.out.println(t3);
		
		TestBean t4 = ctx.getBean("test2", TestBean.class);
		System.out.println(t4);
		
		
		//id가 test3인 bean객체의 주소값을 받아온다.
		TestBean t5 = ctx.getBean("test3", TestBean.class);
		System.out.println(t5);
		
		TestBean t6 = ctx.getBean("test3", TestBean.class);
		System.out.println(t6);
		ctx.close();
	}
}
