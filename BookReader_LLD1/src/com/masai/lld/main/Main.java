package com.masai.lld.main;

import com.masai.lld.beans.Book;
import com.masai.lld.beans.User;
import com.masai.lld.onlineReaderSystem.OnlineReaderSystem;

public class Main {

	public static void main(String[] args) throws Exception {
		OnlineReaderSystem reader = new OnlineReaderSystem();
		
		User user1 = new User(1,"Rabindra Kumar");
		User user2 = new User(2,"Ram");
		
		Book book1 = new Book(101,"Java","Programming in Java");
		Book book2 = new Book(201,"The White Tiger","Humorous Novel");
		
		reader.getUserManager().addUser(user1);
		reader.getUserManager().addUser(user2);
		
		reader.getLibrary().addBook(book1);
		reader.getLibrary().addBook(book2);
		
		reader.setUser(user1);
		reader.setBook(book1);
		
		reader.getDashboard().displayUserInfo();
		reader.getDashboard().displayBookInfo();
		reader.getDashboard().nextPage();
		//reader.getDashboard().previousPage();
		reader.getDashboard().refreshPage();

	}

}
