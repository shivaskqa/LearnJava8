package com.java8.javatechie.practicetest;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8PracticeWithCustomObjects {

	public static void main(String[] args) {
		
		List<ChessPlayer> players=new ArrayList<>();
		
		players.add(new ChessPlayer(1, "Magnus Carlsen",2839,"Norway"));
		players.add(new ChessPlayer(8, "Gukesh D",2758,"India"));
		players.add(new ChessPlayer(9, "Vishwanathan Anand",2754,"India"));
		players.add(new ChessPlayer(10, "Wesley", 2753, "USA"));
		players.add(new ChessPlayer(19, "Praggnandhaa", 2727,"India"));
		players.add(new ChessPlayer(27, "Vidit Santosh Gujarati",2716,"India"));
		players.add(new ChessPlayer(29, "Arjun Erigaisi",2715,"India"));
		players.add(new ChessPlayer(31, "Pentala Harikrishna", 2711,"India"));
		players.add(new ChessPlayer(43, "Nihal Sarin", 2694,"India"));
		players.add(new ChessPlayer(18, "Koneru Hampi", 2749,"India"));
		players.add(new ChessPlayer(22, "Dronavalli Harika",2720,"India"));
		players.add(new ChessPlayer(32, "Tania Sachdev", 2700, "India"));
		/*
		 * System.out.println("Sorting the players based on their FIDE ratings");
		 * players.stream().sorted(Comparator.comparing(ChessPlayer::getPlayerRank).
		 * reversed()).forEach(player->System.out.println(player));
		 * 
		 * System.out.println("Sorting the players based on their names.."); players
		 * .stream()
		 * .sorted(Comparator.comparing(ChessPlayer::getPlayerName)).forEach(System.out:
		 * :println);
		 * 
		 * players.stream().collect(Collectors.groupingBy((ChessPlayer::getPlayerCountry
		 * ),Collectors.counting())) .entrySet() .stream()
		 * .forEach(System.out::println);
		 * 
		 */		
		Map<String,Integer> data=new HashMap<>();
		  
		   data.put("Ankit", 7000);
		   data.put("Gokesh", 7000);
		   data.put("Sunishith", 5000);
		   data.put("Saravanan", 9000);
		   data.put("Krishnan", 4000);
		   data.put("Gopalan", 1000);
		   data.put("Boopalan", 4000);
		   data.put("Seethapathi", 2856);
		   data.put("Tiru", 5000);
		   
		   //data.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(entry->System.out.println(entry));
		   //data.entrySet().stream().sorted(Map.Entry.comparingByKey(Comparator.reverseOrder())).forEach(entry->System.out.println(entry));
		   //data.entrySet().stream().sorted(Map.Entry.comparingByValue()).forEach(entry->System.out.println(entry));
		   //data.entrySet().stream().sorted(Map.Entry.comparingByValue(Comparator.reverseOrder())).forEach(entry->System.out.println(entry));
		   
		   
		   data
		   .entrySet()
		   .stream()
		   .collect(Collectors.groupingBy(Map.Entry::getValue,Collectors.mapping(Map.Entry::getKey,Collectors.toList())))
           .entrySet()
           .stream()
           .sorted(Collections.reverseOrder(Map.Entry.comparingByKey()))
           .collect(Collectors.toList())
           .forEach(System.out::println);
		   
		   
System.out.println(
		    data.entrySet()
		   .stream()
		   .collect(Collectors.groupingBy(entry->entry.getValue(),Collectors.mapping(entry->entry.getKey(),Collectors.toList())))
		   .entrySet()
		   .stream()
		   .sorted(Comparator.comparing(entry->-entry.getKey())).toList().get(1)
			);
		   
		   String str="welcomeindia";
		   
		   Arrays.stream(str.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
		   .entrySet()
		   .stream()
		   .collect(Collectors.toList())
		   .forEach(System.out::println);
	}
}	