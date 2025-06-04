package com.example.Company.Reporsitory;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.config.EnableMongoRepositories;

import com.example.Company.entity.*;

@EnableMongoRepositories
public interface Contact_Reporsitory extends MongoRepository<Contact, String> {

}
