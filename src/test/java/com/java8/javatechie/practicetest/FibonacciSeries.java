package com.java8.javatechie.practicetest;

public class FibonacciSeries {
	
	public static void main(String[] args) {
		
		int firstTerm=0,secondTerm=1,n=10;
		
		for(int i=1;i<=10;i++)
		{
			System.out.print(firstTerm+" , ");
			
			int nextTerm=firstTerm+secondTerm;
			firstTerm=secondTerm;
			secondTerm=nextTerm;
			
		}
		
		int factorialValue=1;
		for(int i=1;i<=5;i++)
			factorialValue=factorialValue*i;
		System.out.println(factorialValue);
	}

}
