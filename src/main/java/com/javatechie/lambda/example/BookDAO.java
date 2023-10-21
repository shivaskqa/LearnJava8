package com.javatechie.lambda.example;

import java.util.ArrayList;
import java.util.List;

public class BookDAO {
	
	
	
	public List<Book> getBooks()
	{
	    List<Book> list=new ArrayList<Book>();
	    
	    list.add(new Book(1,"Core Java",255));
	    list.add(new Book(2,"Hibernate",155));
	    list.add(new Book(3,"Spring",200));
	    list.add(new Book(4,"Web Service",300));
	    list.add(new Book(5,"API Development",400));
		
		return list;
	}

}
