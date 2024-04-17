package com.enola.demo.member.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.enola.demo.BeforeLoager;
import com.enola.demo.Data;
import com.enola.demo.HelloEnabled;

@Component
@Qualifier("member")
@BeforeLoager
public class MemberService implements HelloEnabled {
	
	@Override
	public void hello(String message) {
		// TODO Auto-generated method stub
		System.out.println("Hello Member Service");
	}
	public void saveData(Data data) {
		System.out.println("Argument Type Annotation");	
	}
	
}
