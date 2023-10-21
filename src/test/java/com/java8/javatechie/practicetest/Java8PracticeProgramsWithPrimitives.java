package com.java8.javatechie.practicetest;

import java.util.Arrays;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8PracticeProgramsWithPrimitives {
	
	public static void main(String[] args) {
		
		
		  List<Integer> numbers=Arrays.asList(4,8,9,2,1,7,6,3);
		  
		  sortListOfNumbersInAsceding(numbers); 
		  sortListOfNumbersInDescending(numbers);
		  
		  List<String>  words=Arrays.asList("moon","sun","earth","saturn","mars","jupiter","uranus", "Neptune","Pluto"); 
		  
		  sortListOfWordsInAscending(words);
		  sortListOfWOrdsInDescending(words);
		  
		  Map<Integer,String> map=new HashMap<>();
		  
		  map.put(178, "virat"); 
		  map.put(195, "rohit"); 
		  map.put(159, "surya");
		  map.put(59, "ishaan"); 
		  map.put(88, "jadeja"); 
		  map.put(77, "ashwin");
		  map.put(33, "rishabh"); 
		  map.put(66, "tilak"); 
		  map.put(44, "prasanna");
		  
		  sortMapKeysInAscendingOrder(map); 
		  sortMapKeysInDescendingOrder(map);
		  sortMapValuesInAscendingOrder(map); 
		  sortMapValuesInDescendingOrder(map);
		 
	 
	 String str="ilovesutomationtesting";
     findCharacterOccurencesInGivenString(str);
     findUniqueCharactersInGivenString(str);
     findDuplicateCharactersInGivenString(str);
     String[] w={"java","selenium","developer","tester","DevOps","Secutiry"};
     findLongestWordInGivenString(w);
	 
     
	}

	private static void findLongestWordInGivenString(String[] words) {
		// TODO Auto-generated method stub
		
		System.out.println("Finding longest word in given sentence with stream and sort..");
		String longestString=
				Arrays.stream(words)
					.map(word->word.toLowerCase())
					.sorted((w1,w2)->w1.length()>w2.length()?-1:1)
					.findFirst()
					.get();
		System.out.println(longestString);
		
		// 2. find Longest name in List using max(Integer::compare).get()
		System.out.println("Finding longest word in given sentence with List using max(Comparator.comparing(String::length).get()");
		String longestStringWithListMax=
					Arrays.stream(words)
						.max(Comparator.comparing(String::length))
						.get();
		System.out.println(longestStringWithListMax);
		
		System.out.println("Finding length of Longest name using max(Integer::compare))");
		int lengthOfLongestString=
				Arrays.stream(words)
					.map(String::length)
					.max(Integer::compare)
					.get();
		System.out.println(lengthOfLongestString);
		
		
		System.out.println("find Longest String using .reduce((x, y) -> x.length() > y.length() ? x : y).get()");
		
		System.out.println(
				Arrays
				.stream(words)
				.reduce((word1,word2)->word1.length()>word2.length()?word1:word2)
				.get()
		);
		
		System.out.println("find Length of Longest String using .reduce((x, y) -> Integer.max(x, y)).getAsInt()");
		
		   System.out.println(Arrays
		   .stream(words)
		   .mapToInt(String::length)
		   .reduce((x,y)->Integer.max(x, y))
		   .getAsInt()
		   );
		   
	}

	private static void findDuplicateCharactersInGivenString(String str) {

		System.out.println("Finding duplicate characters in given string..");
		Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()>1)
		.forEach(System.out::println);
	}

	private static void findUniqueCharactersInGivenString(String str) {

		System.out.println("Finding Unique characters in given String..");
		Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(e->e.getValue()==1)
		.forEach(System.out::println);
	}

	private static void findCharacterOccurencesInGivenString(String str) {

		System.out.println("Finding character occurences in given string..");
		Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.forEach(System.out::println);
		
	}

	private static void sortMapValuesInDescendingOrder(Map<Integer, String> map) {

		System.out.println("Sorting values in HashMap in descending order..");
        map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
		
	}

	private static void sortMapValuesInAscendingOrder(Map<Integer, String> map) {

		System.out.println("Sorting values in HashMap in ascending order..");
		map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
	}

	private static void sortMapKeysInDescendingOrder(Map<Integer, String> map) {

		System.out.println("Sorting keys in descending order..");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(e->System.out.println(e));
	}

	private static void sortMapKeysInAscendingOrder(Map<Integer, String> map) {

		System.out.println("Sorting keys in ascending order..");
		map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(e->System.out.println(e));
		
	}

	private static void sortListOfWOrdsInDescending(List<String> words) {

		System.out.println("Words are displayed in descending order..");
		words
		.stream()
		.map(e->e.toLowerCase())
		.sorted(Comparator.reverseOrder())
		.forEach(e->System.out.println(e));
		
	}

	private static void sortListOfWordsInAscending(List<String> words) {

		System.out.println("Words are displayed in ascending order..");
		
		words
		.stream()
		.map(e->e.toLowerCase())
		.sorted()
		.forEach(e->System.out.println(e));
		
	}

	private static void sortListOfNumbersInAsceding(List<Integer> numbers) {
  
		System.out.println("Numbers are displayed in ascending order..");
		 
		numbers
		 .stream()
		 .sorted()
		 .forEach(e->System.out.println(e+","));
	}
	
	private static void sortListOfNumbersInDescending(List<Integer> numbers) {
	    System.out.println("Numbers are displayed in descending order..");
	    numbers
	    	.stream()
	    		.sorted(Comparator.reverseOrder())
	    			.forEach(e->System.out.println(e+","));
	}

}
