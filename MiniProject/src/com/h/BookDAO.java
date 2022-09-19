//DAO is used for CRUD operations
package com.h;

import java.util.Iterator;

public class BookDAO extends Database{

	public BookDAO() {
		super();
	}
	
	public void viewAll() {
		// TODO Auto-generated method stub
		Iterator<Book> i = bookSet.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
		
	}
	
	public void insertBook(Book b) {
		
		//Book b = new Book(id,title,author,price);
		bookSet.add(b);
	}
	
	public void deleteBook(int id) {
		Iterator<Book> i = bookSet.iterator();
		while(i.hasNext()) {
			if(i.next().id == id) {
				i.remove();
			}
		}
	}
	
	public void updatePrice(int id, int price) {
		for(Book i: bookSet) {
			if(i.id == id) {
				i.price = price;
			}
		}
	}
	
	public Book findBook(String title) {
		Book b = new Book();
		for(Book i: bookSet) {
			if(i.title.equals(title)) {
				b.id = i.id;
				b.title = i.title;
				b.author = i.author;
				b.price = i.price;
			}	
		}
		return b;
	}
	
	
}
