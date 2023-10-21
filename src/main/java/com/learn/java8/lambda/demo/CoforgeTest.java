package com.learn.java8.lambda.demo;

import java.util.HashMap;
import java.util.Map;

public class CoforgeTest {
	
	public static void main(String[] args) {
		
		
		 String str="welcome to coforge";

		 Map<Character,Integer> map=new HashMap<>();
		 
		 char ch[]=str.toCharArray();
		 
		  for(Character c: ch)
		  {
		     if(map.get(c)==null)
			     map.put(c,1);
			 else
		        map.put(c,map.get(c)+1);
		 }
		 
		 for(Map.Entry<Character,Integer> entry: map.entrySet())
		     System.out.println(entry.getKey()+":"+entry.getValue()); 
		     
		    
		
	}

}
