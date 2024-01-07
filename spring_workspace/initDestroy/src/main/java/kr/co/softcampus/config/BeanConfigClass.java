package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;

import kr.co.softcampus.beans.TestBean1;

@Configuration
public class BeanConfigClass {

	//객체가 생성되고 소멸할떄 메서드 호출
	@Bean(initMethod = "init", destroyMethod="destroy")
	@Lazy
	public TestBean1 java1() {
		return new TestBean1();
	}
}
