package kr.co.softcampus.main;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.support.FileSystemXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.FileSystemResource;
import org.springframework.util.FileSystemUtils;

import kr.co.softcampus.beans.TestBean;

public class MainClass {

	public static void main(String[] args) {
//		test1();
//		test2();
//		test3();
		test4();
	}
	
	//BeanFactory - 패키지 내부
	public static void test1() {
		// beans.xml 파일을 ClassPathResource를 통해 로드합니다.
		ClassPathResource res = new ClassPathResource("kr/co/softcampus/config/beans.xml");
		//ClassPathResource로 로드한 beans.xml 파일을 이용하여 XmlBeanFactory를 생성
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t1 = factory.getBean("t1", TestBean.class);
		System.out.println(t1);
		
		TestBean t2 = factory.getBean("t1", TestBean.class);
		System.out.println(t2);
	}
	
	//BeanFactory - 패키지 외부
	public static void test2() {
		FileSystemResource res = new FileSystemResource("beans.xml");
		XmlBeanFactory factory = new XmlBeanFactory(res);
		
		TestBean t1 = factory.getBean("t2", TestBean.class);
		System.out.println(t1);
		
		TestBean t2 = factory.getBean("t2", TestBean.class);
		System.out.println(t2);
	}
	
	//ApplicationContext - 패키지 내부
	public static void test3() {
		ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("kr/co/softcampus/config/beans.xml");
		
		TestBean t1 = ctx.getBean("t1", TestBean.class);
		System.out.println(t1);
		
		TestBean t2 = ctx.getBean("t1", TestBean.class);
		System.out.println(t2);
		
		ctx.close();
	}
	
	//ApplicationContext - 패키지 외부
	public static void test4() {
		FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("beans.xml");
		
		TestBean t1 = ctx.getBean("t2", TestBean.class);
		System.out.println(t1);
		
		TestBean t2 = ctx.getBean("t2", TestBean.class);
		System.out.println(t1);
		
		ctx.close();
	}
}
