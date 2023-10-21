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

public class Java8SortTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * List<Integer> numbers=new ArrayList<Integer>();
		 * 
		 * Collections.addAll(numbers, 11,9,6,8,9,5,1,6,2,5,8,7,3,4);
		 * 
		 * Collections.sort(numbers);
		 * 
		 * System.out.println("Ascendeing order of numbers in the list:");
		 * numbers.stream().forEach(e->System.out.print(e+" , "));
		 * 
		 * System.out.println(); Collections.sort(numbers,Collections.reverseOrder());
		 * System.out.println("Numbers displayed in descending order..");
		 * numbers.stream().forEach(e->System.out.print(e+" , "));
		 * 
		 * List<String> places=new ArrayList<>();
		 * Collections.addAll(places,"charminar","zoopark","ramojifilmcity","wonderla",
		 * "planetourium","salarjungmuseum","tankbund","lumbinipark");
		 * 
		 * System.out.
		 * println("places are displayed in ascending order.. alphabetical order");
		 * Collections.sort(places);
		 * places.stream().forEach(place->System.out.print(place+","));
		 * 
		 * System.out.println(); Collections.sort(places,Collections.reverseOrder());
		 * System.out.println("places are displayed in alphabetical descending order.."
		 * ); places.stream().forEach(place->System.out.print(place+","));
		 * System.out.println();
		 */
		
		List<String> holyplaces=new ArrayList<>();
		Collections.addAll(holyplaces, "Sreesailam","Thirupathi","Yadagirigutta","Phalani",
										"Thiruthathani","Yganti","Mahanandi","Indrakeeladri","Shabarimalai",
				                       "Thiruvannamalai","Shiridi","Varanaasi","Ujjaini","Vellore","Palakollu","Kukke","Somasila");
		
		//holyplaces.stream().filter(e->e.startsWith("S")).forEach(System.out::println);
		//holyplaces.stream().filter(e->e.startsWith("P")).forEach(System.out::println);
		//holyplaces.stream().filter(e->e.startsWith("T")).forEach(System.out::println);
		//holyplaces.stream().filter(e->e.startsWith("U")).forEach(System.out::println);
		//holyplaces.stream().filter(e->e.startsWith("K")).forEach(System.out::println);
		
		
		Map<String,Integer> subjectnMarks=new HashMap<>();
		
		subjectnMarks.put("English",99);
		subjectnMarks.put("Hindi",92);
		subjectnMarks.put("Telugu",96);
		subjectnMarks.put("Mathematics",100);
		subjectnMarks.put("Environmental Science",90);
		subjectnMarks.put("General Knowledge",95);
		subjectnMarks.put("Computers",100);
		subjectnMarks.put("Reasoning",98);
		subjectnMarks.put("Social",94);
	
		//ssubjectnMarks.entrySet().stream().sorted(Map.Entry.comparingByKey()).collect(Collectors.toList()).forEach(System.out::println);
		subjectnMarks.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).collect(Collectors.toList()).forEach(System.out::println);
		subjectnMarks.entrySet().stream().sorted(Map.Entry.comparingByValue()).collect(Collectors.toList()).forEach(System.out::println);
		subjectnMarks.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).collect(Collectors.toList()).forEach(e->System.out.println(e));
		
		subjectnMarks
		.entrySet()
		.stream()
		.collect(Collectors.groupingBy(entry->entry.getValue(),Collectors.mapping(entry->entry.getKey(), Collectors.toList())))
		.entrySet()
		.stream()
		.sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		.forEach(System.out::println);
		
		String str="mississipi";
		
		Arrays.stream(str.split(""))
		      .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		      .entrySet()
		      .stream()
		      .forEach(System.out::println);
		
		
		
		Map<String,Integer> map2=new HashMap<>();
		map2.put("Adam", 5000);
		map2.put("Arun", 6000);
		map2.put("Apeksha", 6800);
		map2.put("Laasya", 7600);
		map2.put("Manasa", 6000);
		map2.put("Manohar", 8000);
		map2.put("Mayur", 8000);
		map2.put("Sudheer", 9000);
		map2.put("Sarvesh", 10000);
		
		map2.entrySet()
		    .stream()
		    .collect(Collectors.groupingBy(entry->entry.getValue(),Collectors.mapping(entry->entry.getKey(), Collectors.counting())))
		    .entrySet()
		    .stream()
		    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
		    .forEach(System.out::println);
		
		map2.entrySet()
	    .stream()
	    .collect(Collectors.groupingBy(entry->entry.getValue(),Collectors.mapping(entry->entry.getKey(), Collectors.toList())))
	    .entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
	    .forEach(System.out::println);
		
		map2.entrySet()
	    .stream()
	    .collect(Collectors.groupingBy(entry->entry.getValue(),Collectors.mapping(entry->entry.getKey(), Collectors.counting())))
	    .entrySet()
	    .stream()
	    .sorted(Map.Entry.comparingByKey(Comparator.reverseOrder()))
	    .toList()
	    .get(0);
		
		
		String word="eeshaanskandha";
		char temp;
		char[] ch=word.toCharArray();
		int n=ch.length;
		
		for(int i=0;i<n/2;i++)
		{
			temp=ch[i];
			ch[i]=ch[n-i-1];
			ch[n-i-1]=temp;
			
		}
		System.out.println(ch);
		
		String[] strs= {"balakrishna","chiranjeevi","nagarjuna","venkatesh","shobhanbabu","krishna","krishnamraju"};
		
		String longestString=Arrays.stream(strs)
		      .reduce((word1,word2)->word1.length()>word2.length()?word1:word2)
		      .get();
		
		System.out.println(longestString);
		
		System.out.println(Collections.max(Arrays.asList(strs),Comparator.comparing(String::length)));
		
        String s=Arrays.asList(strs).stream().max(Comparator.comparing(String::length)).get();
        System.out.println(s);
		
	}

}
