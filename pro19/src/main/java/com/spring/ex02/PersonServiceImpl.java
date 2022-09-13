package com.spring.ex02;

public class PersonServiceImpl implements PersonService {
	private String name;
	private int age;
	
	//생성자에 의한 주입
	public PersonServiceImpl(String name) {
		this.name = name;
	}
	
	public PersonServiceImpl(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	public void sayHello() {
		System.out.println("이름: "+ name);
		System.out.println("나이: "+ age + "살");
	}
	
	
}

