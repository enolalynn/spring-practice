package com.enola.demo.service;

import java.time.LocalDate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.enola.demo.repo.RegistrationRepo;
import com.enola.demo.repo.StudentRepo;
import com.enola.dto.Classes;
import com.enola.dto.Registration;
import com.enola.dto.Student;

@Service
public class RegistrationService {
	@Autowired
	private StudentRepo studentRepo;
	private RegistrationRepo registrationRepo;
	public Registration register(Classes classes,Student student, LocalDate date) {
		
		var registStudent = studentRepo.create(student);
		
		return registrationRepo.create(new Registration(0,classes,registStudent,date));
		
	}
}
