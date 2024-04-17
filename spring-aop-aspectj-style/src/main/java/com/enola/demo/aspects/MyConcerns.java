package com.enola.demo.aspects;



import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;

import org.springframework.context.annotation.Configuration;

import com.enola.demo.dto.Result;
@Aspect
@Configuration
public class MyConcerns {
//	@Pointcut("bean(myService)")
//	void myServiceBean() {	
//	}
//	  
	@Before(value = "bean(myService) && args(value,*)",argNames = "value")
	void beforLog(String value) {
		System.out.println("Before Execution");
		System.out.println("Value is %s".formatted(value));
	}
	@AfterReturning(pointcut = "bean(myService) && execution(com.enola..Result *(..)) && args(name,count)",
					argNames = "result,name,count",
					returning = "result")	
	void afterReturning(Result result, String name, int count) {
		System.out.println("Return A Value");
		System.out.println("Arg Name : %s".formatted(name));
		System.out.println("Arg Count : %d".formatted(count));
		System.out.println(result);
	}
	@AfterThrowing("bean(myServive)")
	void afterThrow() {
		System.out.println("After Throwing an Exception");
	}
	@After("bean(myService)")
	void afterAll(int count) {
		System.out.println("After Finally");
	}
	
	@Around(value = "bean(myService) && args(value,count)", argNames = "value,count")
	Object aroundInvoke(ProceedingJoinPoint joinPoint, String value, int count) {
		
		Object result = null;
		System.out.println("Around before invoke");
		System.out.println("Value is %s.".formatted(value));
		System.out.println("Value is %s.".formatted(count));
		try {
			result = joinPoint.proceed();
			System.out.println("Around after returning");
		}catch(Throwable e){
			System.out.println("Around after throwing");
			throw new RuntimeException(e);
		}finally {
			System.out.println("Around finally");
		}
		return result;
		
	}
	
}
