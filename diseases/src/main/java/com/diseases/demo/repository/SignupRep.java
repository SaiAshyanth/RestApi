package com.diseases.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diseases.demo.model.Signup;

@Repository
public interface SignupRep extends JpaRepository<Signup, String>{
	Signup findByuname(String uname);
}