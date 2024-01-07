package kr.co.sortcampus.main;

import kr.co.sortcampus.beans.HelloWorld;
import kr.co.sortcampus.beans.HelloWorldEn;
import kr.co.sortcampus.beans.HelloWorldKo;

public class MainClass {

	public static void main(String[] args) {
		
		HelloWorld hello1 = new HelloWorldKo();	//new HelloWorldEn();
		callMethod(hello1);
		
		HelloWorld hello2 = new HelloWorldKo(); //new HelloWorldEn();
		callMethod(hello2);
	}
	
	public static void callMethod(HelloWorld hello) {
		hello.sayHello();
	}
}
