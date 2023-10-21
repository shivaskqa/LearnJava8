package com.javatechie.lambda.example;

import java.util.Collections;
import java.util.List;

public class BookService {

	
   public List<Book> getBooksInSortOrder()
   {
	   List<Book> books=new BookDAO().getBooks();
	   
		/*
		 * The following line shows that, user own comparator class (MyComparator)
		 * implements Comparator interface and overrides compare method This is purely
		 * traditional approach.. Collections.sort(books, new MyComparator());
		 */

	   //Following code with Lambda expression - for displaying books in descending order..
	   //Collections.sort(books,(o1, o2) -> o2.getName().compareTo(o1.getName()));
	   
	   //Following code with Lambda expression - for displaying books in ascending order..
	   Collections.sort(books,(o1, o2) -> o1.getName().compareTo(o2.getName()));
	   
	   
	   return books;
   }
	
   public static void main(String[] args) {
	
	   System.out.println(new BookService().getBooksInSortOrder());
	   
}
}

/*
 * class MyComparator implements Comparator<Book> {
 * 
 * @Override public int compare(Book o1, Book o2) {
 * 
 * //The below return statement sort books with name in ascending order..
 * //return o1.getName().compareTo(o2.getName());
 * 
 * //The below return statement sort books with name in descending order..
 * return o2.getName().compareTo(o1.getName()); } }
 */