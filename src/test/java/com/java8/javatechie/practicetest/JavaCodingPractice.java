package com.java8.javatechie.practicetest;

import java.util.Arrays;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JavaCodingPractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println(reverseString("welcome to java world"));
		System.out.println(reverseEachStringInSentence("welcome to java world"));
		eachOccurenceOfCharacterInGivenString("welcome to java world");
		countVowelsInGivenString("java techie for selenium automation");
		pullCharactersDigitsSpecialCharacters("Pr!ogr#am%m*in&g Lan?#guag(e");
	}

	private static void countVowelsInGivenString(String text) {
		// TODO Auto-generated method stub
		text=text.replaceAll("[^aeiou]", "");
		System.out.println(text);
		
		Arrays
			.stream(text.split(""))
				.collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
				.entrySet().stream()
				.forEach(System.out::println);
		
	}

	private static void eachOccurenceOfCharacterInGivenString(String text) {
		// TODO Auto-generated method stub
		
		text=text.replaceAll(" ", "");
		Arrays.stream(text.split(""))
		.collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream().forEach(System.out::println);
		
	}

	private static String reverseEachStringInSentence(String text) {
		// TODO Auto-generated method stub
		
		String temp[]=text.split(" ");
		String revWords="";
		  
		  for(String s:temp)
				revWords=revWords+reverseString(s)+" ";
		  return revWords;
	}

	private static String reverseString(String text) {
		// TODO Auto-generated method stub
		String rev="";
		for(int i=text.length()-1;i>=0;i--)
		  rev=rev+text.charAt(i);
		
		return rev;
	}

	private static void pullCharactersDigitsSpecialCharacters(String text)
	{
		
		char ch[]=text.toCharArray();
		int charCount=0,spaces=0;
		int numerics=0;
		int spchars=0;
		
		
		for(int i=0;i<text.length()-1;i++)
		{
			if(Character.isAlphabetic(ch[i]))
                charCount++;
			else if(Character.isDigit(ch[i]))
				numerics++;
			else if(Character.isWhitespace(ch[i]))
				spaces++;
			else
				spchars++;
		}
		
		System.out.println("Characters in the given String.."+charCount);
		System.out.println("Numerics in the given String.."+numerics);
		System.out.println("Numerics in the given String.."+spaces++);
		System.out.println("Special characters in the given String.."+spchars);
	}
	
}
