package com.javatechie.stream.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import com.javatechie.stream.api.example.Employee;

public class SortMap {

	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String,Integer> map=new HashMap<>();
		
		map.put("eight", 8);
		map.put("five", 5);
		map.put("two",2);
		map.put("six", 6);
		map.put("one", 1);
		
		List<Entry<String,Integer>> entries=new ArrayList<>(map.entrySet());
		//Sort keySet using lambda expression
		Collections.sort(entries,(e1,e2)-> e1.getKey().compareTo(e2.getKey()));
		/*
		 * for(Entry<String,Integer> entry:entries) System.out.println(entry);
		 */
		//using stream api
	    
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);   
	    map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	    
	    Map<Employee,Integer> treeMap=new TreeMap<>((o1,o2) -> (int) (o2.getSalary()-o1.getSalary()));
	    
	    treeMap.put(new Employee(176,"Roshan","IT",600000), 60);
	    treeMap.put(new Employee(388,"Vikas","CIVIL",900000), 50);
	    treeMap.put(new Employee(470,"Vimalkanth","DEFENCE",500000), 80);
	    treeMap.put(new Employee(624,"Sourav","CORE",400000), 75);
	    treeMap.put(new Employee(196,"Prakash","SOCIAL",1200000), 120);
	    
	   // System.out.println(treeMap);
 
	    
	    treeMap
	    	.entrySet()
	    	  .stream()
	    	    .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary).reversed())) //descending order
	    	      .forEach(System.out::println);
	    
	    
	    //Display employees in ascending order
	    treeMap
	    .entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getSalary)))
	      .forEach(e->System.out.println(e));
	    
	    
        //Sort the Employee objects list with primitives     
	    treeMap
	     .entrySet()
	     .stream()
	     .sorted(Map.Entry.comparingByValue())  //sorting with values and values are primitives i.e., integer
	     .forEach(System.out::println);  
	    
	    
	    //Sort the employee objects list in descending order
	    treeMap
	      .entrySet()
	      .stream()
	      .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
	       .forEach(System.out::println);
	    
	    
	    treeMap
	    .entrySet()
	    .stream()
	     .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getName))) //display the names in ascending order
	       .forEach(System.out::println);
	    
	    System.out.println("Display employees based on their department");
	    treeMap
	    .entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByKey(Comparator.comparing(Employee::getDept)))
	     .forEach(System.out::println);
	    
	    
	    
	   // Collections.sort(entries,(o1,o2)->o1.getKey().compareTo(o2.getKey()));
	}

}
