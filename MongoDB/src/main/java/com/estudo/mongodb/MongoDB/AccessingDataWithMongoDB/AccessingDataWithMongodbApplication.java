package com.estudo.mongodb.MongoDB.AccessingDataWithMongoDB;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


@SpringBootApplication
public class AccessingDataWithMongodbApplication implements CommandLineRunner {
	
	@Autowired
	private CostumerRepository repository;
	
	public static void main(String[] args) {
		SpringApplication.run(AccessingDataWithMongodbApplication.class, args);
	}
	
	
	@Override
	public void run(String... args) throws Exception {
		repository.deleteAll();
		
		repository.save(new Customer("Marcus","Lira"));
		repository.save(new Customer("Jessica","Lira"));
		repository.save(new Customer("Gabriel","Rodrigues"));
		repository.save(new Customer("Lucas","Granjeiro"));
		
		
		System.out.println("Customers found with findAll():");
		System.out.println("-------------------------------");
		for (Customer customer : repository.findAll()) {
			System.out.println(customer);
		}
		
		
		System.out.println("Customer found with first name Marcus: ");
		System.out.println("------------------------------------");
		System.out.println(repository.findByFirstName("Marcus"));
		
		System.out.println();
		System.out.println();		
		System.out.println("Customer found with last name Lira");
		for(Customer customer : repository.findByLastName("Lira") ) {
			System.out.println(customer);
		}
		
		
	}
}
