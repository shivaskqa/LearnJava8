package com.javatechie.stream.api.example;

import java.util.List;
import java.util.stream.Collectors;

public class TaxService {
	
	public static List<Employee> evaluateTaxUsers(String str)
	{
		//With if - else condition
		/*
		 * if(str.equalsIgnoreCase("tax")) return
		 * EmployeeDB.getEmployees().stream().filter(e->e.getSalary()>500000).collect(
		 * Collectors.toList()); else return
		 * EmployeeDB.getEmployees().stream().filter(e->e.getSalary()<=500000).collect(
		 * Collectors.toList());
		 */
		//With Ternary Operator
		return (str.equalsIgnoreCase("tax")) ?
		  EmployeeDB.getEmployees().stream().filter(e->e.getSalary()>500000).collect(Collectors.toList()):
		  EmployeeDB.getEmployees().stream().filter(e->e.getSalary()<=500000).collect(
				  Collectors.toList());
	}

	public static void main(String[] args) {
		
		System.out.println(evaluateTaxUsers("tax"));
	}
}
