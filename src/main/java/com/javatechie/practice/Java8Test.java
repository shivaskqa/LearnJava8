package com.javatechie.practice;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.stream.Collectors;

public class Java8Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<Integer,String> map=new HashMap<>();
		
		map.put(3, "Three");
		map.put(10, "Ten");
		map.put(6, "Six");
		map.put(4, "Four");
		map.put(8, "Eight");
		
		
		//sortMapWithData(map);
		
		int num=4;
		Map<String,Integer> salMap=new HashMap<String, Integer>();

		salMap.put("Ankit", 9500);
		salMap.put("Aniketh", 7500);
		salMap.put("Ankur", 6000);
		salMap.put("Akash", 5000);
		salMap.put("Anvesh", 5500);
		salMap.put("Avesh", 4500);
		salMap.put("Anand", 7100);
		salMap.put("Gourav", 7700);
		salMap.put("Sourva", 8900);
		salMap.put("Purna", 9900);
		
		Map<String,Integer> map2 = new HashMap<>();
        map2.put("anil",1000);
        map2.put("ankit",1200);
        map2.put("bhavna",1200);
        map2.put("james",1200);
        map2.put("micael",1000);
        map2.put("tom",1300);
        map2.put("daniel",1300);
		
		getNthHigestSalary(num,map2);
		
		
		
	}

	private static void getNthHigestSalary(int num, Map<String, Integer> map2) {

		Map.Entry<Integer, List<String>> finalresult=   map2.entrySet()
				    .stream()
				    .collect(Collectors.groupingBy(entry ->entry.getValue(),
				          Collectors.mapping(entry -> entry.getKey(),Collectors.toList())
				    ))
				    .entrySet()
				    .stream()
				    .sorted(Comparator.comparing(e->-e.getKey()))
				    .toList()
				    .get(1);
		System.out.println(finalresult);
				    		
				    
	}

	private static void sortMapWithData(Map<Integer, String> map) {
        System.out.println("Map is sorted with Keys..");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
		System.out.println("Map is sorted with Values");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
		System.out.println("Print keys in descending order..");
		map
		 .entrySet()
		  .stream()
		  .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		  .forEach(entry->System.out.println(entry));
		System.out.println("Print values in descending order..");
		 map
		 .entrySet()
		 .stream()
		 .sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		 .forEach(entry->System.out.println(entry));
			
		
		
		
		
	}

}
