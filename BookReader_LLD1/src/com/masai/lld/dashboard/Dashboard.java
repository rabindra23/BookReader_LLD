package com.masai.lld.dashboard;

import com.masai.lld.beans.Book;
import com.masai.lld.beans.User;

public class Dashboard {

	private Book currentBook;
    private User currentUser;
    private int bookPageNumber;

    public Dashboard() {
        currentBook = null;
        currentUser = null;
        bookPageNumber = 0;
    }

    public void nextPage() {
        if (currentBook != null) {
            bookPageNumber++;
        }
    }

    public void previousPage() {
        if (currentBook != null && bookPageNumber > 0) {
            bookPageNumber--;
        }
    }

    public void refreshPage() {
        System.out.println("Current page: " + bookPageNumber);
    }

    public void displayUserInfo() {
        if (currentUser != null) {
            System.out.println("User name: " + currentUser.getName());
            System.out.println("User id: " + currentUser.getId());
        } else {
            System.out.println("No user is currently logged in.");
        }
    }

    public void displayBookInfo() {
        if (currentBook != null) {
            System.out.println("Book title: " + currentBook.getTitle());
            System.out.println("Book details: " + currentBook.getDetails());
        } else {
            System.out.println("No book is currently open.");
        }
    }

    public void setBook(Book book) {
        currentBook = book;
        bookPageNumber = 0;
    }

    public void setUser(User user) {
        currentUser = user;
    }	
}
