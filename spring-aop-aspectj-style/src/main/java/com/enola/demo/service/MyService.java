package com.enola.demo.service;

import org.springframework.stereotype.Component;

import com.enola.demo.dto.Result;

@Component
public class MyService {
	public Result hello(String name, int count) {
		System.out.println("Hello from MyService.");
		return new Result(name,count);
	}
}
