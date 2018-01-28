package com.kutsal.instagram.database;

import java.util.HashMap;
import java.util.Map;

import com.kutsal.instagram.model.User;

public class Database {
	
	private Database() {
		
	}
	
	private int i = 0;
	private Map<Integer,User> userData = new HashMap<>();
	
	private static Database instance ;
	
	public static  Database getInstance() {
		if(instance == null) {
			instance = new Database();
		}
		return instance;
	}
	
	public Integer saveUser(User user) {
		Integer id = new Integer(i +1);
		i++;
		userData.put(id, user);
		return id;
	}
	
	public User getUser(Integer id) {
		return userData.get(id);
	}

}
