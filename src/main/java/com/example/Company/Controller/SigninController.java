package com.example.Company.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.security.saml2.Saml2RelyingPartyProperties.Registration.Signing;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.Company.entity.Contact;
import com.example.Company.entity.Signin;

import jakarta.servlet.http.HttpSession;

import com.example.Company.Service.Contact_Service;
import com.example.Company.Service.Signin_Service;

@Controller
public class SigninController {
	
	
	 @Autowired
	 private Signin_Service cServ;
	 
	 @Autowired
	 private Contact_Service contactServ;
	
	 @GetMapping("/")
	    public String home() {
	        return "Home";  // returns page.html
	    }
	 @GetMapping("/about")
	 public String about()
	 {
		 return "About";
	 }
	 @GetMapping("/features")
	 public String features()
	 {
		 return "Freatures";
	 }
	 @GetMapping("/pricing")
	 public String pricing()
	 {
		 return "Pricing";
	 }
	 @GetMapping("/blog")
	 public String blog()
	 {
		 return "Blog";
	 }
	 @GetMapping("/contact")
	 public String contact()
	 {
		 return "Contact";
	 }
	 @GetMapping("/contactn")
	 public String contactn()
	 {
		 return "Newcontact";
	 }
	 
	 @GetMapping("/signin")
	 public String signin()
	 {
		 return "Signin";
	 }

	 @PostMapping("/singinf")
	    public String addUser(@ModelAttribute Signin s, Model model, HttpSession session) {
	        // Check if email already exists
	        if (cServ.getUserByEmail(s.getEmail()) != null) {
	        	 Signin user= cServ.getUserByEmail(s.getEmail());
	  	       session.setAttribute("userd", user);
	  	        model.addAttribute("success", "Signup successful! You can now log in.");
	  	        model.addAttribute("Userfname", user.getFirstname());
	            return "Head"; 
	        }
	        cServ.save(s);
	        
	        Signin user= cServ.getUserByEmail(s.getEmail());
	       session.setAttribute("userd", user);
	        model.addAttribute("success", "Signup successful! You can now log in.");
	        model.addAttribute("Userfname", user.getFirstname());
	        return "Head";  
	    }
	 
	 @PostMapping("/contactnew")
	 public String Contact( @ModelAttribute Contact c,Model model, HttpSession session )
	 {
		 Signin userd=(Signin) session.getAttribute("userd");
		 contactServ.contactSave(c);
	     model.addAttribute("success", "Signup successful! You can now log in.");
	     model.addAttribute("Userfname", userd.getFirstname());
	     return "Head";  
	 }

}
