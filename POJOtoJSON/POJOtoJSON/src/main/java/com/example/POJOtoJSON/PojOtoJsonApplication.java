package com.example.POJOtoJSON;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.example.POJOtoJSON.Entity.Customer;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

@SpringBootApplication
public class PojOtoJsonApplication {

	public static void main(String[] args) {
		SpringApplication.run(PojOtoJsonApplication.class, args);
		
		
		Customer customer=new Customer(1, "Muthuraj", "R", "muthu@gamil.com");
		
		System.out.println("Printing the Java Object ");
		
		System.out.println(customer.toString());
		
		ObjectMapper obj=new ObjectMapper();
		
		
		
		System.out.println("Printing as JSON");
		
		try {
				
			System.out.println(obj.writeValueAsString(customer));
		
		} catch (JsonProcessingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}

}
