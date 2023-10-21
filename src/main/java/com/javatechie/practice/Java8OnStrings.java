package com.javatechie.practice;

import java.util.Arrays;
import java.util.Comparator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class Java8OnStrings {

	public static void main(String[] args) {

		String str="ilovejavatechie";
		
		//findCharacterOccurencesInString(str);
		//findDuplicateCharactersInString(str);
		//findUniqueCharactersInString(str);
		//findFirstNonRepeatedElementInString(str);
		int num[]=new int[] {10,45,54,6,78,39,93,9,5,55,78,99,93};
		//findSecondHighestNumberFromGivenArray(num,2);
		
		String[] strs= {"java","techie","springboot","microservices","dockerk8samazonwebservices"};
		
		findLongestWordInGivenString(strs);
		
		int numbers[]= {5,9,11,2,8,21,1,29};
		findNumbersStartsWith1(numbers);
		
		//String-join example

		String[] s= {"a","b","c","d"};
		  String results=String.join( "-",s);
		  System.out.println(results);
		  
	   IntStream.rangeClosed(1, 10)
	   .skip(1)
	   .limit(8)
	   .forEach(System.out::println);
	}

	private static void findNumbersStartsWith1(int[] numbers) {

		Arrays.stream(numbers)
		.boxed()
		.map(s->s+"")
		.filter(e->e.startsWith("2"))
		.collect(Collectors.toList())
		.forEach(System.out::println);
	}

	private static void findLongestWordInGivenString(String[] strs) {

		String longestWord=Arrays.stream(strs)
		.reduce((word1,word2)->word1.length()>word2.length()?word1:word2)
		.get();
		System.out.println(longestWord);
	}

	private static void findSecondHighestNumberFromGivenArray(int[] num,int index) {

		int secHighest=Arrays.stream(num)
		.boxed()
		.distinct()
		.sorted(Comparator.reverseOrder())
		.collect(Collectors.toList())
		.get(index-1);
		
		System.out.println(secHighest);
		
	}

	private static void findFirstNonRepeatedElementInString(String str) {

		String firstNonRepeatedElement=Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),LinkedHashMap::new,Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x->x.getValue()==1)
		.findFirst()
		.get()
		.getKey();
		
		System.out.println(firstNonRepeatedElement);
		
	}

	private static void findUniqueCharactersInString(String str) {

		Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(x->x.getValue()==1)
		.collect(Collectors.toList())
		.forEach(entry->System.out.println(entry));
		
	}

	private static void findDuplicateCharactersInString(String str) {

		List<Entry<String, Long>> map=Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		.entrySet()
		.stream()
		.filter(kv->kv.getValue()>1)
		.collect(Collectors.toList());
		System.out.println(map);
		
	}

	private static void findCharacterOccurencesInString(String str) {

		/*
		 * Arrays.stream(str.split(""))
		 * .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		 * .entrySet() .forEach(entry->System.out.println(entry));
		 */
		
		Map<String,Long> map=Arrays.stream(str.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
		
		System.out.println(map);
		
		
	}

}
