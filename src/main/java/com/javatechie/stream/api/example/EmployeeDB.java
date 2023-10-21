package com.javatechie.stream.api.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class EmployeeDB {

	public static List<Employee> getEmployees()
	{
		
	  List<Employee> employeesList=new ArrayList<>();

	  employeesList.add(new Employee(176,"Roshan","IT",600000));
	  employeesList.add(new Employee(388,"Vikas","CIVIL",900000));
	  employeesList.add(new Employee(470,"Vimalkanth","DEFENCE",500000));
	  employeesList.add(new Employee(624,"Sourav","CORE",400000));
	  employeesList.add(new Employee(196,"Prakash","SOCIAL",1200000));
	  
	  employeesList.stream().sorted(Comparator.comparing(Employee::getName)).collect(Collectors.toList());
	  
	  return employeesList;
	}
	
	public static void main(String[] args) {
		
		EmployeeDB edb=new EmployeeDB();
		System.out.println(edb.getEmployees());
	}
}
