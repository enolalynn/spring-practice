package com.enola.demo.aspects;

import org.aopalliance.intercept.Joinpoint;
import org.aspectj.lang.ProceedingJoinPoint;

public class MethodAccessAspect {
	public void beforeExecution( Joinpoint joinPoint) {
		
	}
	
	public void afterExecution(Joinpoint joinPoint) {
			
		}
	
	public void afterThrowing(Joinpoint joinPoint) {
		
	}
	
	public void afterFinally(Joinpoint joinPoint) {
		
	}
	
	public Object aroundInvocation(ProceedingJoinPoint joinPoint) {
		
		Object result = null;
		try {
			//before execution
			System.out.println("Before Execution");
			result = joinPoint.proceed();
			
			//after execution
			System.out.println("After Execution");
			return result;
		} catch (Throwable e) {
			//after throwing
			System.out.println("After Throwing");
			throw new RuntimeException(e);
			
		}finally {
			System.out.println("After Finally");
		}
		
	}
}
