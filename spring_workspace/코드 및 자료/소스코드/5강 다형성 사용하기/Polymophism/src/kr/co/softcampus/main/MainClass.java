package kr.co.softcampus.main;

import kr.co.softcampus.beans.HelloWorld;
import kr.co.softcampus.beans.HelloWorldEn;
import kr.co.softcampus.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HelloWorld hello1 = new HelloWorldKo(); //new HelloWorldEn();
		callMethod(hello1);
		
		HelloWorld hello2 = new HelloWorldKo(); //new HelloWorldEn();
		callMethod(hello2);
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}

}
