package com.enola.demo.utils.aspects;

import java.lang.reflect.Method;

import org.springframework.aop.MethodBeforeAdvice;

public class BeforeLoggerAdvisor implements MethodBeforeAdvice{

	@Override
	public void before(Method method, Object[] args, Object target) throws Throwable {
		System.out.println("___________________");
		System.out.println("Before Method Execution");
		System.out.println("%-10s: %s".formatted("Target",
				target.getClass().getSimpleName()));		
		System.out.println("%-10s: %s".formatted("Method",
				method.getName()));
		
		System.out.println("___________________");
		
		for (int i=0;i<args.length;i++) {
	 		var arg = args[i];
			System.out.println("%-10s: %s".formatted(i+1,
					target.getClass().getSimpleName(),arg));
			System.out.println("___________________");		
		}
	}
}
