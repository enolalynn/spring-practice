package com.enola.test;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;

import com.enola.demo.Data;
import com.enola.demo.admin.service.AdminService;
import com.enola.demo.member.service.MemberService;

@SpringJUnitConfig(locations = "classpath:/application.xml")
public class PointCutConfigDemo {
		@Autowired
		private MemberService service;
		@Test
		void test() {
			service.hello("Hello AOP");
			
		}
	
}
