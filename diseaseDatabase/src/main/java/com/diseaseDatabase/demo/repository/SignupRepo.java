package com.diseaseDatabase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diseaseDatabase.demo.model.Signup;

@Repository
public interface SignupRepo extends JpaRepository<Signup, Integer>{
	Signup findByuname(String uname);


}
