package com.diseaseDatabase.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.diseaseDatabase.demo.model.Password;

@Repository
public interface PasswordRepository extends JpaRepository<Password, Integer>{

}
