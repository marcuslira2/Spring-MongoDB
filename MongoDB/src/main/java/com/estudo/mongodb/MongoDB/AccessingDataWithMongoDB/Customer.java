package com.estudo.mongodb.MongoDB.AccessingDataWithMongoDB;

import org.springframework.data.annotation.Id;

public class Customer {
	
	@Id
	public String id;
	
	public String firstName;
	public String lastName;
	
	
	
	public Customer( String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	
	
	@Override
	public String toString() {
		return "Entity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + "]";
	}
	

}
