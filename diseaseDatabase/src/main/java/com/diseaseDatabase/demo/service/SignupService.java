package com.diseaseDatabase.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.diseaseDatabase.demo.model.Signup;
import com.diseaseDatabase.demo.repository.SignupRepo;

@Service
public class SignupService {
	@Autowired
    SignupRepo signRep;
	public Signup save(Signup s) 
	{
		
		return signRep.save(s);
	}

	public String checkLogin(String uname, String password) 
	{
		Signup u = signRep.findByuname(uname);
		if(u == null)
		{
			return" No user found " ;
		}
		else
		{
			if(u.getPassword().equals(password))
			{
				return"Login Successfull" ;
			}
			else
			{
				return "Login Failed" ;
			}
		}
	}
	

	

	public String forgetData(String uname, String password) {
		 Signup user = signRep.findByuname(uname);
         if (user == null) {
             return "No User Found\nPlease Try Again!!!!";
         } else {
             // Check if the usernames match in a case-sensitive manner
             if (user.getUname().equals(uname)) {
           	  
//                 if (user.getPassword().equals(password)) {
//                     return "Login Successful";
//                 } else {
//                     return "Login Failed";
//                 }
           	  user.setPassword(password);
                 signRep.save(user);
           	  return "password has changed successfully";
             } else {
                 return "Login Failed";
             }
         }
	}

}
