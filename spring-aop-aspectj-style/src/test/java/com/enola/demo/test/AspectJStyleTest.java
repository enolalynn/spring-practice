package com.enola.demo.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.enola.demo.config.AppConfig;
import com.enola.demo.service.MyService;

@SpringJUnitConfig(classes = AppConfig.class)
public class AspectJStyleTest {
	@Autowired
	MyService service;
	@Test
	void test() {
		service.hello("AspectJ",10);
	}
}
