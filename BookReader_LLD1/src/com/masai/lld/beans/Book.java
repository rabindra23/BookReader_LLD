package com.masai.lld.beans;

public class Book {

	private int bookId;
	private String title;
	private String details;
	
	public Book() {}
	
	public Book(int bookId, String title, String details) {
		this.bookId = bookId;
		this.title = title;
		this.details = details;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDetails() {
		return details;
	}

	public void setDetails(String details) {
		this.details = details;
	}
	
	
}
