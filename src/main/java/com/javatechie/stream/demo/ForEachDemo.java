package com.javatechie.stream.demo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

public class ForEachDemo {
	
	//filter  --> conditional check
	
	
	public static void main(String[] args) {
		
		List<String> lordShivaFiveNames=new ArrayList<String>();

		lordShivaFiveNames.add("Satyojatha");
		lordShivaFiveNames.add("Vaamadeva");
		lordShivaFiveNames.add("Thathpurusha");
		lordShivaFiveNames.add("Aghora");
		lordShivaFiveNames.add("Eeshaana");
		
	    //Traditional Approach
		for(String s:lordShivaFiveNames)
			System.out.println(s);
		
		//ForEach Loop
		lordShivaFiveNames.stream().forEach(e->System.out.println(e));
		
		
		List<String> games=Arrays.asList("Cricket","FootBall","VolleyBall","Tennis","Hockey","Carroms","Chess","Basket Ball","Table Tennis","Kabaddi");
		//filter - Predicate funcational interface
		Predicate<String> p=t->t.startsWith("T");
	    games.stream().filter(p).forEach(game->System.out.println(game));
		
		
		
		
		
		Map<Integer,String> map=new HashMap<Integer,String>();
		
		map.put(1, "Virat");
		map.put(2, "Rohit");
		map.put(3, "Surya");
		map.put(4, "Jadeja");
		map.put(5, "Ishaan");
		
		map.forEach((K,V)->System.out.println(K+":"+V));
		
		//Print Map key value pair using entruset,stream API
		map.entrySet().stream().forEach(obj->System.out.println(obj));
		
		//Print map where keys are even
		map.entrySet().stream().filter(k->k.getKey()%2==0).forEach(e->System.out.println(e));
		
	}

}
