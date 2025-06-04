package com.example.Company.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Company.Reporsitory.*;
import com.example.Company.entity.Signin;


@Service

public class Signin_Service {
	
	
	@Autowired
	 private Signin_Reporsitory signinRepository;

	    // Save new user
	    public void save(Signin user) {
	        signinRepository.save(user);
	    }

	    // Find user by email
	    public Signin getUserByEmail(String email) {
	        return signinRepository.findByEmail(email);
	    }

}
