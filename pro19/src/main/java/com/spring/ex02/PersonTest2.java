package com.spring.ex02;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.FileSystemResource;

public class PersonTest2 {

	public static void main(String[] args) {
		//실행 시 person.xml을 읽어 들임             이 소스를 가지고 XmlBeanFactory 객체 생성
		BeanFactory factory = new XmlBeanFactory(new FileSystemResource("person.xml"));
		//id가 personService1인 빈을 가져옴
		PersonService person1 = (PersonService) factory.getBean("personService1");
		person1.sayHello();
		System.out.println();
		
		//id가 personService2인 빈을 가져옴
		PersonService person2 = (PersonService) factory.getBean("personService2");
		person2.sayHello();
	}

}
