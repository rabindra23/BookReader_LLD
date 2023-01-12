package com.masai.lld.utils;

import java.util.HashMap;

import com.masai.lld.beans.Book;

public class Library {

	HashMap<Integer,Book> books;
	
	public Library() {
		books = new HashMap<Integer,Book>();
	}
	
	public boolean addBook(Book book) throws Exception {
		if(books.containsKey(book.getBookId())==true) {
			throw new Exception("Book already exists!!!!");
		}
		books.put(book.getBookId(), book);
		return true;
	}
	
	public boolean addBook(int bookId, String title, String details) throws Exception {
		if(books.containsKey(bookId)==true) {
			throw new Exception("Book already exists!!!!");
		}
		
		Book book = new Book(bookId, title, details);
		books.put(bookId, book);
		return true;
	}
	
	public boolean removeBook(int bookId) throws Exception {
		if(books.containsKey(bookId)==false) {
			throw new Exception("Book does not exists!!!!");
		}
		books.remove(bookId);
		return true;
	}
	
	public Book findBook(int bookId) throws Exception {
		if(books.containsKey(bookId)==false) {
			throw new Exception("Book does not exists!!!!");
		}
		return books.get(bookId);
	}
}
