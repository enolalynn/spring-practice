package com.enola.hello.model;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
	
	public String getMessage() {
		return "Hello from root application context!";
	}
}
