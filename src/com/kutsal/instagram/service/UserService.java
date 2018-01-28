package com.kutsal.instagram.service;

import javax.ejb.Stateless;

import com.kutsal.instagram.database.Database;
import com.kutsal.instagram.integration.rest.model.TokenResponse;
import com.kutsal.instagram.model.User;

@Stateless
public class UserService {

	public User crateOrUpdateUser(TokenResponse response) {
		User user = new User(response); 
		Database.getInstance().saveUser(user);
		return user; 
	}

}
