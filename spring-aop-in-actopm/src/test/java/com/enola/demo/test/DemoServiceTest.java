package com.enola.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.enola.demo.service.DemoService;

@SpringJUnitConfig(locations = "classpath:/application.xml")
public class DemoServiceTest {
	@Autowired
	private DemoService service;
	@Test
	void test() {
		service.voidMethodWithoutArgument();
	}
	
}
