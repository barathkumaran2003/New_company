package com.example.Company.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Contactus") // MongoDB collection name

public class Contact {
	 @Id
	    private String id; // MongoDB uses String IDs by default (ObjectId)

	    private String name;
	    private String email;
	    private String message;
	    
	    public Contact() {}

		public Contact(String id, String name, String email, String message) {
			super();
			this.id = id;
			this.name = name;
			this.email = email;
			this.message = message;
		}

		public String getId() {
			return id;
		}

		public void setId(String id) {
			this.id = id;
		}

		public String getName() {
			return name;
		}

		public void setName(String name) {
			this.name = name;
		}

		public String getEmail() {
			return email;
		}

		public void setEmail(String email) {
			this.email = email;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
	    
	    

}
