package com.java8.javatechie.practicetest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8PracticePrograms {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String[] strs= {"balakrishna","chiranjeevi","nagarjuna","venkatesh","shobhanbabu","krishna","krishnamraju"};
	
		System.out.println(
		Arrays
		.stream(strs)
		.sorted((w1,w2)->w1.length()>w2.length()?-1:1)
		.findFirst()
		.get());
		
		System.out.println(
			Arrays
		.stream(strs)
		.reduce((w1,w2)->w1.length()>w2.length()?w1:w2)
		.get()
		);
		
		String name=Collections.max(Arrays.asList(strs),Comparator.comparing(String::length));
		System.out.println(name);
		
		List<String> list=Arrays.asList(strs);
		Collections.sort(list, Collections.reverseOrder());
		System.out.println(list);
		
		Arrays.stream(strs)
		.max(Comparator.comparing(String::length))
		.get();
		
		Arrays.stream(strs)
		.map(String::length)
		.max(Integer::compare)
		.get();

		Map<String,Integer> data=new HashMap<>();
		  
		   data.put("Ankit", 7000);//3
		   data.put("Gokesh", 10000); //1
		   data.put("Sunishith", 5000); //5
		   data.put("Saravanan", 9000);//2
		   data.put("Krishnan", 4000);//6
		   data.put("Gopalan", 1000);//9
		   data.put("Boopalan", 3500);//7
		   data.put("Seethapathi", 2856);//8
		   data.put("Tiru", 5500);//4
		
		   data.entrySet().stream()
		      .sorted(Map.Entry.comparingByKey())
		        .collect(Collectors.toList()).forEach(System.out::println);
		   
		   data.entrySet().stream()
		      .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		      .collect(Collectors.toList())
		      .forEach(System.out::println);
		    		  
		   
		   int nthsalary=2;
		   //finding highest salary when salary is not duplicated in HashMap
		   findNthHighestSalaryFromMap(data,nthsalary);

		   
		Map<String,Integer> map2=new HashMap<>();
			  
			map2.put("Ankit", 8000);
			map2.put("Gokesh", 10000); 
			map2.put("Sunishith", 8000); 
			map2.put("Saravanan", 10000);
			map2.put("Krishnan", 5000);
			map2.put("Gopalan", 4000);
			map2.put("Boopalan", 4000);
			map2.put("Seethapathi", 3000);
			map2.put("Tiru", 5000);
			
			map2.entrySet()
			.stream()
			.collect(Collectors.groupingBy(e->e.getValue(),Collectors.mapping(e->e.getKey(), Collectors.toList())))
			.entrySet()
			.stream()
			.sorted(Comparator.comparing(e->-e.getKey()))
			.toList()
			.get(1);
			
			map2.entrySet().stream()
			.collect(Collectors.groupingBy(entry->entry.getValue(),Collectors.mapping(entry->entry.getKey(), Collectors.toList())))
			.entrySet()
			.stream()
			.sorted(Comparator.comparing(e->-e.getKey()))
			.toList();			
			
			map2
			    .entrySet()
			      .stream()
			        .collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
			        .entrySet()
			        .stream()
			        .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
			        .toList()
			        .get(1);
			        		

		   findNthHighestSalaryFromMapSalWithDups(map2,3);
		   
		   
	}

	private static void findNthHighestSalaryFromMapSalWithDups(Map<String, Integer> map2, int nthsalary) {

		    
		    map2
		      .entrySet()
		      .stream()
		      .collect(Collectors.groupingBy(entry->entry.getValue(),Collectors.mapping(e->e.getKey(), Collectors.toList())))
		        .entrySet()
		        .stream()
		        .sorted(Comparator.comparing(e->-e.getKey()))
		        .toList()
		        .get(nthsalary-1);
		
		    
		    map2
		     .entrySet()
		     .stream()
		     .collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey, Collectors.toList())))
		      .entrySet()
		      .stream()
		      .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
		      .toList()
		      .get(nthsalary-1);
		      
	}

	private static void findNthHighestSalaryFromMap(Map<String, Integer> data, int nthsalary)
	{

		Map.Entry<String, Integer> salariedEntry=
				   data
				    .entrySet()
				    .stream()
				    .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
				    .collect(Collectors.toList())
				    .get(nthsalary-1);
				   
				   System.out.println(salariedEntry);	
	}
}
