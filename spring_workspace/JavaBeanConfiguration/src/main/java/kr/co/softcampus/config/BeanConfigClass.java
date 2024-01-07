package kr.co.softcampus.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Scope;

import kr.co.softcampus.beans.TestBean1;
import kr.co.softcampus.beans.TestBean2;
import kr.co.softcampus.beans.TestBean3;
import kr.co.softcampus.beans.TestBean4;

@Configuration
public class BeanConfigClass {

	//메소드 이름이 bean의 이름이됌. java1
	@Bean
	public TestBean1 java1() {
		TestBean1 t1 = new TestBean1();
		
		return t1;
	}
	
	//name속성을 지정해주면 메서드이름이 아니라 name속성의 이름이 빈의 이름이됌 java600
	@Bean(name = "java600")
	public TestBean1 java500() {
		TestBean1 t1 = new TestBean1();
		
		return t1;
	}
	
	//Lazy설정 시 getBean했을 떄 
	@Bean
	@Lazy
	public TestBean2 java2() {
		TestBean2 t2 = new TestBean2();
		
		return t2;
	}
	
	@Bean
	@Scope("prototype")
	public TestBean3 java3() {
		TestBean3 t3 = new TestBean3();
		
		return t3;
	}
	
	@Bean
	public TestBean4 java4() {
		TestBean4 t4 = new TestBean4();
		
		return t4;
	}
	
	//Primary 어노테이션을 사용하면 같은 리턴타입을 반환할 때 Primary가 붙은 것을 씀
	@Bean
	@Primary
	public TestBean4 java5() {
		TestBean4 t4 = new TestBean4();
		
		return t4;
	}
}
