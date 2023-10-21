package com.learn.java8.lambda.demo;

@FunctionalInterface
public interface MyFunctionalInterface {

	void m1();
	
	default void m2()
	{
		System.out.println("we are in default m2 method..");
	}
	default void m3()
	{
		System.out.println("We are in default m3 method..");
	}
	static void m4()
	{
		System.out.println("We are in static m4 method..");
	}
}

