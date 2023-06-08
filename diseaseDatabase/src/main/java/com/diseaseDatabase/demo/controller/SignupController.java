package com.diseaseDatabase.demo.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.diseaseDatabase.demo.model.Signup;
import com.diseaseDatabase.demo.service.SignupService;

@RestController
@CrossOrigin
public class SignupController {
	   @Autowired
	   SignupService signSer;
	   @PostMapping("/rposting")
	   public Signup save(@RequestBody Signup s)
	   {
		   return signSer.save(s);
	   }
	   @PostMapping("/loggings")
	   public String login(@RequestBody Map<String,String> loginData)
	   {
	 	 String uname = loginData.get("uname");
	 	 String password = loginData.get("password");
		 String result = signSer.checkLogin(uname,password);
		 return result;
	   }
	   @PutMapping("/forgetpass")
	   public Signup update(@RequestBody Signup s)
	   {
		   return signSer.update(s);
	   }
}
