
package com.java8.javatechie.practicetest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8CodingPracticeTest {

	
	public static void main(String[] args) {
		
    String sentence="Wearepracticingjava8Programs";
    
    
    Map<String,Integer> map=new HashMap<>();
    
    map.put("Virat", 18);
    map.put("Rohit", 45);
    map.put("Ashwin",99);
    map.put("Surya", 63);
    map.put("Ishaan",14);
    map.put("Tilak", 33);
    map.put("Jadeja", 81);
    map.put("Shikhar",88);
    
    map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
    map.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(System.out::println);
    map.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(System.out::println);
    map.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(System.out::println);
    
    System.out.println(Arrays.stream(sentence.split(" "))
    .map(e->e.toLowerCase())
    .filter(e->e.contains("e"))
    .findFirst()
    .get());

    
    Arrays.stream(sentence.split(""))
    .map(e->e.toLowerCase())
    .map(e->e.replaceAll("[0-9]", ""))
    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
    .entrySet()
    .stream()
    .forEach(System.out::println);
		
		
		
	}
	
}
