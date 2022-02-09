package com.estudo.mongodb.MongoDB.AccessingDataWithMongoDB;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

public interface CostumerRepository extends MongoRepository<Customer, String> {
	
	public Customer findByFirstName(String firstName);
	public List<Customer> findByLastName(String lastName);
	

}
