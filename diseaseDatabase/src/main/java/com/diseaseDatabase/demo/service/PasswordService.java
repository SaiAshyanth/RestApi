package com.diseaseDatabase.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diseaseDatabase.demo.model.Password;
import com.diseaseDatabase.demo.repository.PasswordRepository;
@Service
public class PasswordService {
	@Autowired
	PasswordRepository passRepo;

	public Password postpassword(Password p) {
		
		return passRepo.save(p);
	}

}
