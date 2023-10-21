package com.javatechie.functional.stream.map.demo;

import java.util.List;
import java.util.stream.Collectors;

public class MapFlatMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		List<Customer> customers=EkartDatabase.getAllCustomers();
		
		//List<Customer> to List<String> -- data transformation..
		//mapping --> customer --> customer.getEmail
		//One to One mapping..
		
		List<String> emailList=customers.stream().map(customer->customer.getEmail()).collect(Collectors.toList());
		System.out.println(emailList);
		
		//flattering -- stream of streams to single stream
		//One to Many mapping --->>> customer-->customer.getPhoneNumbers()
		List<List<String>> phoneNumbersList=customers.stream().map(customer->customer.getPhonenumbers()).collect(Collectors.toList());
		System.out.println(phoneNumbersList);
		
		List<String> phoneNumbers=customers.stream().flatMap(customer->customer.getPhonenumbers().stream()).collect(Collectors.toList());
		System.out.println(phoneNumbers);
	}

}
