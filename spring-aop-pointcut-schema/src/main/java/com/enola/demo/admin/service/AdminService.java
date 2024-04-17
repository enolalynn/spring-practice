package com.enola.demo.admin.service;

import org.springframework.stereotype.Component;

import com.enola.demo.HelloEnabled;
@Component
public class AdminService implements HelloEnabled{

	@Override
	public void hello(String message) {
		// TODO Auto-generated method stub
		System.out.println("Message from Admin Service is %s.".formatted(message));
	}
	public void doSomething() {
		System.out.println("I am doing something");
		
	}
}
