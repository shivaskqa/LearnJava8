package com.javatechie.functional.stream.map.demo;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EkartDatabase {
	
	public static List<Customer> getAllCustomers()
	{
		
		return Stream.of(
				   new Customer(101, "Virat", "Virat18@gmail.com", Arrays.asList("3939633969","3939633968")),
	               new Customer(102, "Sachin", "sachin10@gmail.com", Arrays.asList("3885588312","3885588313")),
	               new Customer(103, "Sourav", "SouravBT@gmail.com", Arrays.asList("5855982359","5855982369")),
	               new Customer(104, "Rohit", "Rohit45@gmail.com", Arrays.asList("5855982366","5855982459")),
	               new Customer(105, "Surya", "suryasky63@gmail.com", Arrays.asList("5855943259" ,"5855988959"))	
				).collect(Collectors.toList());
				
	}

}
