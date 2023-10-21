package com.javatechie.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicateDemo 
{
	public static void main(String[] args) {

		//Predicate is defined as follows..
		Predicate<Integer> pr=(t)-> t%2==0;
		List<Integer> listofnums=Arrays.asList(5,3,4,1,2);
		//In filter, we are passing the predicate in other words defined condition
		listofnums.stream().filter(pr).forEach(System.out::println);
	}

}
