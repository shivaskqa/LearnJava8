package com.javatechie.pre.functional.demo;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class SupplierDemo
{
	public static void main(String[] args) 
	{
		List<String> listofStrs=Arrays.asList();
		
		Predicate<String> pr=(str)->str.startsWith("S");
		listofStrs.stream().filter(pr).forEach(s->System.out.println(s));
		
		System.out.println(listofStrs.stream().findAny().orElseGet(()-> "Hi,Java Techie.."));
		
	}
	
}
