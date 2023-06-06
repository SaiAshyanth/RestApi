package com.diseaseDatabase.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diseaseDatabase.demo.model.Password;
import com.diseaseDatabase.demo.service.PasswordService;

@CrossOrigin
@RestController
public class PasswordContoller {
	@Autowired
	PasswordService passServ;
	@PostMapping("/postpassword")
	public Password postpassword(@RequestBody Password p)
	{
		return passServ.postpassword(p);
	}

}
