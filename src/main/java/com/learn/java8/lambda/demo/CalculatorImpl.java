package com.learn.java8.lambda.demo;

import javax.management.RuntimeErrorException;

interface Calculator
{
	//void switchOn();
	
	//void display(int number);
	
	int subtract(int i1,int i2);
}

public class CalculatorImpl   {

	public static void main(String[] args) {
		
		/*
		 * Calculator calc=()->
		 * System.out.println("we are calling interface method of Calculator..");
		 * 
		 * calc.switchOn();
		 */
	   
		/*
		 * Calculator c= (a)-> System.out.println("Display the number: "+a);
		 * c.display(10);
		 */
		
		Calculator c=(a,b)->{
			if(b<a) {throw new RuntimeException("message..");}
			else
				return b-a;
		};
		System.out.println(c.subtract(10, 30));
		
		
		
	}

	// Lambda expression : () -> body;
}
