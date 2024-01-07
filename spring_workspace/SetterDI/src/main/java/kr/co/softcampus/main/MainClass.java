package kr.co.softcampus.main;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
		
		TestBean obj1 = new TestBean();
		obj1.setData1(100);
		
		System.out.println("obj1.data1 : " + obj1.getData1());
		
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.println("t1.data1 : " + t1.getData1());
		System.out.println("t1.data2 : " + t1.getData2());
		System.out.println("t1.data3 : " + t1.isData3());
		System.out.println("t1.data4 : " + t1.getData4());
		System.out.println("t1.data5 : " + t1.getData5());
		System.out.println("t1.data6 : " + t1.getData6());
		
		ctx.close();
	}
}
