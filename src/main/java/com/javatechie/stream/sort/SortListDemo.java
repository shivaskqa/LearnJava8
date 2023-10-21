package com.javatechie.stream.sort;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class SortListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	 List<Integer> numbers=Arrays.asList(12,4,6,9,2);
	 
	 //**** Sorting Primitives using Traditional approach and Stream API - Java 8 ***** //
	 
	 //Sort using Collections.sort method
	 Collections.sort(numbers); // Ascending order
	 System.out.println(numbers);
	 Collections.reverse(numbers); //Descending order
	 System.out.println(numbers);
	 
	 //Sort using stream API
	 numbers.stream().sorted().forEach(ele->System.out.println(ele));//Ascending order
	 //Descending order using Stream API
	 numbers.stream().sorted(Comparator.reverseOrder()).forEach(System.out::println);
		
		
	}

}
