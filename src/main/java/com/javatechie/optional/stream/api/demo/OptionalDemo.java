package com.javatechie.optional.stream.api.demo;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import com.javatechie.functional.stream.map.demo.Customer;
import com.javatechie.functional.stream.map.demo.EkartDatabase;

public class OptionalDemo {
	
	
	public static Customer getCustomerByEmail(String email) throws Exception
	{
		List<Customer> customers=EkartDatabase.getAllCustomers();
		return customers
				.stream()
				 .filter(c->c.getEmail().equalsIgnoreCase(email))
				  .findAny()
				   .orElseThrow(()->new Exception("email is not present.."));
	}
	
	
	
	public static void main(String[] args) throws Exception {
		
     Customer customer=new Customer(101, "Sachin", "test@gmail.com", Arrays.asList("5956868222","5956868223"));
     
     //empty, of, ofNuallable
     
     Optional<Object> emptyObject=Optional.empty();
     System.out.println(emptyObject);
     
    //Optional<String> emailOptional=Optional.of(customer.getEmail());
		//System.out.println(emailOptional);
		
	 Optional<String> emailOptional2=Optional.ofNullable(customer.getEmail());
	 //if mail is not present for a customer then default@gmail.com should be replaced in place of it.
	 	System.out.println(emailOptional2.orElse("default@gmail.com"));
	 	//If mail is not present then throw some custom exception , via that user intimated that details are missing..
		//System.out.println(emailOptional2.orElseThrow(()->new IllegalArgumentException("email id is not present..")));
		
		
		System.out.println(emailOptional2.map(String::toUpperCase).orElseGet(()->"default email.."));
				
       System.out.println(getCustomerByEmail("sachin@gmail.com"));
		
	}

}
