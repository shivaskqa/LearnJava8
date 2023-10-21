package com.java8.javatechie.practicetest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.function.Function;
import java.util.stream.Collectors;

public class ScannerDemo {

	public static void main(String[] args) {
		
		String words="Cigniti technologies private limited and this company is basically for automated testers";
		
		Scanner scanner=new Scanner(System.in);
		
		String s=scanner.nextLine();
	
		String str[]=words.toLowerCase().replaceAll(" ", "").split("");
		
		Map<String,Integer> map=new HashMap<>();
		
		for(String temp:str)
		{
			if(map.get(temp)==null)
				map.put(temp, 1);
			else
				map.put(temp, map.get(temp)+1);
			
		}
		
		for(Map.Entry<String,Integer> entry:map.entrySet())
		{
			if(s.equalsIgnoreCase(entry.getKey()))
				System.out.println(entry.getKey()+" : "+entry.getValue());
		}
		
		
		
		Arrays.stream(words.toLowerCase().replaceAll(" ", "").split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.forEach(System.out::println);
		
		
		
		
		
	}

	
	
	
}
