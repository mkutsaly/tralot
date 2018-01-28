package com.kutsal.instagram.model;

import com.kutsal.instagram.integration.rest.model.TokenResponse;

public class User extends UserInstagram {
	
	private Integer id;

	public User(TokenResponse response)  {
		super(response);
	}
	
	public User() { 
	}
	
	

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	} 
	
}
