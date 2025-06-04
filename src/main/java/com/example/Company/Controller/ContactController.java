package com.example.Company.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Company.Service.*;
import com.example.Company.entity.*;

@Controller
public class ContactController {
	
	 @Autowired
	 private Contact_Service contactServ;
	 
	 @PostMapping("/contact")
	 public String Contact( @ModelAttribute Contact c,Model model )
	 {
		 contactServ.contactSave(c);
	     model.addAttribute("success", "Signup successful! You can now log in.");
	     return "Head";  


	 }
	 


}
