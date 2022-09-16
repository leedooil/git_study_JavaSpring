package com.spring.ex01;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class LoggingAdvice implements MethodInterceptor {
	public Object invoke(MethodInvocation invocation) throws Throwable{
		System.out.println("[메서드 호출 전 : LogginAdvice");
		System.out.println(invocation.getMethod() + "메서드 호출 전");
		
		//일종의 spring 약속 구문 : 잘 실행되었다라는 뜻
		//invocation을 이용해 메서드 호출
		Object object = invocation.proceed();
		
		System.out.println("[메서드 호출 후 : LogginAdvice");
		System.out.println(invocation.getMethod() + "메서드 호출 후");
		return object;
	}
}
