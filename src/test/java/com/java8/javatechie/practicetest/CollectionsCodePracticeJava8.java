package com.java8.javatechie.practicetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CollectionsCodePracticeJava8 {
	
	
	public static void main(String[] args) {
		
		List<Integer> list=new ArrayList<>();
		Collections.addAll(list, 1,3,4,5,2,9,7,8,6);
		
		Collections.sort(list);
		
		System.out.println(list);
		
		Collections.sort(list,Collections.reverseOrder());
		
		System.out.println(list);
		
		List<String> strs=new ArrayList<>();
		Collections.addAll(strs, "bharath","russia","america","france","israel","indonesia","england","china");
		
		Collections.sort(strs);
		System.out.println(strs);
		
		Collections.sort(strs,Collections.reverseOrder());
		System.out.println(strs);
		
		String sentence="we are welcoming to you bharath";
		
		Arrays.asList(sentence.split(" "))
		.stream()
		.sorted()
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		Arrays.asList(sentence.split(" "))
		.stream()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		//Finding maximum length word in given string
         String maxlengthWord=Arrays.asList(sentence.split(" "))
           .stream()
           .sorted(Comparator.reverseOrder())
           .collect(Collectors.toList())
           .get(1);
         
         System.out.println("Max length of word from a given string..");
		 System.out.println(maxlengthWord);
		
		 
		 Arrays.asList(sentence.split(" "))
		 .stream()
		 .map(String::length)
		 .max(Integer::compare)
		 .get();
		 
		 
		maxlengthWord= Arrays.asList(sentence.split(" "))
		 .stream()
		 .reduce((word1,word2)->word1.length()>word2.length()?word1:word2)
		 .get();
		 System.out.println("Max length of word from a given string..");
		 System.out.println(maxlengthWord);
		
		 
		String word="cigniti india private limited";
		
		Arrays.asList(word.split(""))
		.stream()
		.sorted()
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		
		
		Arrays.asList(word.split(""))
		.stream()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		
		
		
		//Display number of occurences of each character in given string
		Arrays.asList(word.split(""))
		  .stream()
		  .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		  .entrySet()
		  .stream()
		  .forEach(System.out::println);
		
		//Number of occurences of character in given string is more than once
		Arrays.asList(word.split(""))
		.stream()
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()>1)
		.forEach(System.out::println);
		
		//Number of occurences of character in given string in equal to one.. means unique characters
		Arrays.asList(word.split(""))
			.stream()
			.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
			.entrySet()
			.stream()
			.filter(e->e.getValue()==1)
			.forEach(System.out::println);
		
		
		Map<String,Integer> map=new HashMap<>();	
		
		map.put("virat", 54459);
		map.put("rohit", 45459);
		map.put("surya", 63639);
		map.put("ishan", 36369);
		
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		map.entrySet().stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue())
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
		map.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByValue(Comparator.reverseOrder()))
		.collect(Collectors.toList())
		.forEach(System.out::println);
		
	}

}
