package com.h;

import java.util.*;

public class Database {
	Set<Book> bookSet = new TreeSet<Book>();; 
	
	public Database() {
		
		Book b1 = new Book(1, "Ramayana", "Valmiki", 500);
		Book b2 = new Book(2, "Mahabharata", "Ved Vyas", 600);
		Book b3 = new Book(3, "Shakuntala", "Panini", 400);
		Book b4 = new Book(4, "The brief history of time", "Stephen Hawking", 300);
		
		bookSet.add(b1);
		bookSet.add(b2);
		bookSet.add(b3);
		bookSet.add(b4);
	}

	
}




