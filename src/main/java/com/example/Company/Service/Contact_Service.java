package com.example.Company.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Company.Reporsitory.*;
import com.example.Company.entity.*;

@Service
public class Contact_Service {
	
	@Autowired
	 private Contact_Reporsitory contactRepository;

	
	public void contactSave(Contact contact) {
        contactRepository.save(contact);
    }


}
