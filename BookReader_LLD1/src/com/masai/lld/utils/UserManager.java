package com.masai.lld.utils;

import java.util.HashMap;

import com.masai.lld.beans.User;

public class UserManager {

	HashMap<Integer,User> users;
	
	public UserManager() {
		users = new HashMap<Integer,User>();
	}
	
	public boolean addUser(User user) throws Exception {
		if(users.containsKey(user.getId())==true) {
			throw new Exception("User already exists!!");
		}
		users.put(user.getId(), user);
		return true;
	}
	
	public boolean addUser(int id, String name) throws Exception {
		if(users.containsKey(id)==true) {
			throw new Exception("User already exists!!");
		}
		User user = new User(id,name);
		users.put(id, user);
		return true;
	}
	
	public boolean removeUser(int id) throws Exception {
		if(users.containsKey(id)==false) {
			throw new Exception("User does not exists!!");
		}
		users.remove(id);
		return true;
	}
	
	public User findUser(int id) throws Exception {
		if(users.containsKey(id)==false) {
			throw new Exception("User does not exists!!");
		}
		return users.get(id);
	}
}
