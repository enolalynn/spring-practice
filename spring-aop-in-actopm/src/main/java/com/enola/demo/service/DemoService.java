package com.enola.demo.service;

import org.springframework.stereotype.Component;

@Component

public class DemoService {
	
	public void voidMethodWithoutArgument() {
		System.out.println("This is a void method without argument.");
		throw new RuntimeException();
	
	}
}
