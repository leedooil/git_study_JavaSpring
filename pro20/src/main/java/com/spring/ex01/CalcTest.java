package com.spring.ex01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CalcTest {
	public static void main(String[] args) {
		//AOPTest.xml 읽어 빈 생성        
		ApplicationContext context = new ClassPathXmlApplicationContext("AOPTest.xml");
		//id가 proxyCal인 빈에 접근
		Calculator cal = (Calculator) context.getBean("proxyCal");
		
		cal.add(100, 20);
		System.out.println();

		cal.subtract(100, 20);
		System.out.println();
		
		cal.multiply(100, 20);
		System.out.println();
		
		cal.divide(100, 20);
	}
}
