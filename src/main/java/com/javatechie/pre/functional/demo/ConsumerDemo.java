package com.javatechie.pre.functional.demo;

import java.util.Arrays;
import java.util.List;

public class ConsumerDemo {

	
	public static void main(String[] args) {

		/*
		 * Consumer<Integer> cd= t ->
		 * System.out.println("Printing input parameter.. "+t); cd.accept(10);
		 */
		
		List<Integer> listofnums=Arrays.asList(5,3,4,1,2);
		
		listofnums.stream().forEach(t->System.out.println(t));
		
	}
}
