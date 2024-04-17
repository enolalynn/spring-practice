package com.enola.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.enola.demo.AdditionalService;
import com.enola.demo.MyService;

@SpringJUnitConfig(locations = "classpath:/application.xml")
public class AopIntroductionTest {
	@Autowired
	private MyService service;
	
	@Test
	void test() {
		service.hello();
		
		if(service instanceof AdditionalService additional) {
			additional.additionalWork();
		}
	}
}
