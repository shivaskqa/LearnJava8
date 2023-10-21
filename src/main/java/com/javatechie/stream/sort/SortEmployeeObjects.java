package com.javatechie.stream.sort;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;
import java.util.function.Function;
import java.util.stream.Collectors;

import com.javatechie.stream.api.example.Employee;

public class SortEmployeeObjects {

	public static void main(String[] args) {
		
		 Map<Employee,Integer> treeMap=new TreeMap<>((o1,o2)->(int)(o1.getSalary()-o2.getSalary()));
		    
		    treeMap.put(new Employee(176,"Roshan","IT",600000), 60);
		    treeMap.put(new Employee(388,"Vikas","CIVIL",900000), 50);
		    treeMap.put(new Employee(470,"Vimalkanth","DEFENCE",500000), 80);
		    treeMap.put(new Employee(624,"Sourav","CORE",400000), 75);
		    treeMap.put(new Employee(196,"Prakash","SOCIAL",1200000), 120);
		    
		    
		    findSecondHigheshSalary(treeMap);
		    int nthsalary=3;
		    findnthHighestSalary(treeMap,nthsalary);
		    String str="ilovejavatechie";
		    findCharacterOccurences(str);
            findDuplicateCharacters(str);
	}

	private static void findDuplicateCharacters(String str) {

		Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()>1)
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		
	}

	private static void findCharacterOccurences(String str) {

     		Arrays.stream(str.split(""))
     		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
     		.entrySet()
     		.stream()
     		.forEach(System.out::println);
		
		
	}
	
	
	

	private static void findnthHighestSalary(Map<Employee, Integer> treeMap, int nthsalary) {

		double sal=treeMap
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed()))
		.collect(Collectors.toList())
		.get(nthsalary)
		.getKey()
		.getSalary();
		
		System.out.println(sal);
		
	}

	private static void findSecondHigheshSalary(Map<Employee, Integer> treeMap) {

		double secondHighestNumber= treeMap
	    	.entrySet()
	    	  .stream()
	    	    .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())) //descending order
	    	      .collect(Collectors.toList()).get(1).getKey().getSalary();
	    	      
		System.out.println(secondHighestNumber);
		
		
	}

}
