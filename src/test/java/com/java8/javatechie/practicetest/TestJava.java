package com.java8.javatechie.practicetest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class TestJava {

	private static long vowels=0;
	private static long consonants=0;
	private static final String TEXT="Java is popular programming language";
									  	
	
	public static void main(String[] args) {
		
    String str="@$##@Qfsdfasd sadFDFSDF  SDfasdfsdgs 3423432 @#$@#$@# ffdssdfsd";
    
    char ch[]=str.toCharArray();
    
    Map<Character,Integer> map=new HashMap<Character,Integer>();
    
    for(Character c:ch)
    {
    	if(map.get(c)==null)
    		map.put(c, 1);
    	else
    		map.put(c, map.get(c)+1);
    	
    }
 
    for(Map.Entry<Character,Integer> entry:map.entrySet())
       System.out.println(entry.getKey()+":"+entry.getValue()); 
       	
    	
	    
    Arrays.stream(str.split(""))
    .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
    .entrySet()
    .stream()
    .forEach(System.out::println);
    
    String name="aaeeiiiioooooouuuuuaaaeeeeooouuu"; 
    
    Arrays.stream(name.split(""))
          .filter(c->c.equalsIgnoreCase("a") || c.equalsIgnoreCase("e") || c.equalsIgnoreCase("i") || c.equalsIgnoreCase("o") || c.equalsIgnoreCase("u"))
          .collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
          .entrySet()
          .stream()
          .forEach(e->System.out.println(e));
    
      countVowelsConsonants(TEXT);
      System.out.println("Vowels in given string.."+vowels);
      System.out.println("Consonants in given string.."+consonants);
    
      for(int i=0;i<10;i++)
  		System.out.println(printFibonacciSeries(i)+" ");
    
	}
	
	public static void countVowelsConsonants(String string)
	{
		
		if(string==null)
			throw new IllegalArgumentException("Input string cant be null..");
		
		string=string.toLowerCase();
		
		vowels=string.chars().filter(ch-> (ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u')).count();
		
		consonants=string.chars().filter(ch-> (ch!='a' || ch!='e' || ch!='i' || ch!='o' || ch!='u'))
				                 .filter(ch-> (ch>='a' && ch<='z')).count();
		
		
	}
	
	public static int printFibonacciSeries(int n)
	{
	
		if(n<=1)
			return n;
		else
			return printFibonacciSeries(n-1)+printFibonacciSeries(n-2);
	}

}
