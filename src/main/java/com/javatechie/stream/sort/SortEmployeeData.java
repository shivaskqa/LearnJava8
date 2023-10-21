package com.javatechie.stream.sort;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

import com.javatechie.stream.api.example.Employee;
import com.javatechie.stream.api.example.EmployeeDB;

public class SortEmployeeData {
	
	public static void main(String[] args) {
		
		List<Employee> listofEmps=EmployeeDB.getEmployees();
		//Using traditional approach
		Collections.sort(listofEmps, new Comparator<Employee>()
				{
					@Override
					public int compare(Employee o1, Employee o2) {
		     			return (int) (o2.getSalary()-o1.getSalary());
				}
				}
		        );
		System.out.println(listofEmps);
		
	   //using Lambda expression
		Collections.sort(listofEmps,(o1,o2)->(int) (o1.getSalary()-o2.getSalary()));
		//System.out.println(listofEmps);
		
		//Using Stream Api
		listofEmps.stream().sorted((o1,o2)->(int) (o1.getSalary()-o2.getSalary())).forEach(obj->System.out.println(obj));
		
		//Using comparator
		listofEmps.stream().sorted(Comparator.comparing(emp->emp.getSalary())).forEach(obj->System.out.println(obj));
		
		//Sort with other fields example: based on name or dept -- Method Reference
		listofEmps.stream().sorted(Comparator.comparing(Employee::getDept)).forEach(obj->System.out.println(obj));
	
	}

}
/*
 * class MyComparator implements Comparator<Employee> {
 * 
 * @Override public int compare(Employee o1, Employee o2) { //This return
 * statement is used for ascending order //return (int)
 * (o1.getSalary()-o2.getSalary()); //The following return statement is used for
 * descending order return (int) (o2.getSalary()-o1.getSalary()); }
 * 
 * }
 */