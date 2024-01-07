package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans2.TestBean4;

@Configuration
//지정된 패키지의 Bean클래스들의 어노테이션을 분석하여 Bean을 등록하라고 지정한다.
@ComponentScan(basePackages = "kr.co.softcampus.beans2")
@ComponentScan(basePackages = "kr.co.softcampus.beans3")
public class BeanConfigClass {

	@Bean
	public TestBean1 java1() {
		return new TestBean1();
	}
	
	@Bean
	public TestBean2 java2() {
		return new TestBean2();
	}
	
	@Bean
	public TestBean2 java3() {
		return new TestBean2();
	}
	
	@Bean
	public TestBean4 java100() {
		return new TestBean4();
	}
	
	@Bean
	public TestBean4 java200() {
		return new TestBean4();
	}
}
