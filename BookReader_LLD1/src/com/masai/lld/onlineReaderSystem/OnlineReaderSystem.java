package com.masai.lld.onlineReaderSystem;

import com.masai.lld.beans.Book;
import com.masai.lld.beans.User;
import com.masai.lld.dashboard.Dashboard;
import com.masai.lld.utils.Library;
import com.masai.lld.utils.UserManager;

public class OnlineReaderSystem {

	private Library library;
	private UserManager userManager;
	private Dashboard dashboard;
	
	public OnlineReaderSystem() {
		library = new Library();
		userManager = new UserManager();
		dashboard = new Dashboard();
	}
	
	public Dashboard getDashboard() {
		return dashboard;
	}
	
	public Book findBook(int bookId) throws Exception {
        return library.findBook(bookId);
    }
	
	public User findUser(int userId) throws Exception {
        return userManager.findUser(userId);
    }
	
	public Library getLibrary() {
		return library;
	}
	
	public void setLibrary(Library library) {
		this.library = library;
	}
	
	public UserManager getUserManager() {
		return userManager;
	}

	public void setUserManager(UserManager userManager) {
		this.userManager = userManager;
	}

	
	public void nextPage() {
	    dashboard.nextPage();
	}

	public void previousPage() {
	    dashboard.previousPage();
	}

	public void refreshPage() {
	    dashboard.refreshPage();
	}

	public void displayUserInfo() {
	    dashboard.displayUserInfo();
	}

	public void displayBookInfo() {
	    dashboard.displayBookInfo();
	}
	 
	public void setBook(Book book) {
	    dashboard.setBook(book);
	}

	public void setUser(User user) {
	    dashboard.setUser(user);
	}

}
