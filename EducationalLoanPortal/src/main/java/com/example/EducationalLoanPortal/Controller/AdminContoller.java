package com.example.EducationalLoanPortal.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.EducationalLoanPortal.Model.LoanApplicationModel;
import com.example.EducationalLoanPortal.Service.AdminService;

public class AdminContoller {
	@Autowired
	  AdminService aService;
	  @GetMapping("/getAdminDetails")
	  public List<LoanApplicationModel> getAdmin()
	  {
		  List<LoanApplicationModel> adminList = aService.getAdmin();
	 	   return adminList;
	  }
	@PostMapping("addUser")
	public LoanApplicationModel saveDetails(@RequestBody LoanApplicationModel lm)
	{
		return aService.saveDeatils(lm);
	}


}
