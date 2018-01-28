package com.kutsal.instagram.model;

import com.kutsal.instagram.integration.rest.model.TokenResponse;

public class UserInstagram {

	private String userId;
	private String userName;
	private String profilePictureUrl;
	private String fullName;
	private String bio;
	private String website;
	private Boolean business; 
	

	public UserInstagram(TokenResponse response) {
		this.userId = response.getUser().getId();
		this.userName = response.getUser().getUsername();
		this.profilePictureUrl = response.getUser().getProfile_picture();
		this.fullName = response.getUser().getFull_name();
		this.bio = response.getUser().getBio();
		this.website = response.getUser().getWebsite();
		if(response.getUser().getIs_business() != null || !"null".equals(response.getUser().getIs_business())) {
			this.business = Boolean.valueOf(response.getUser().getIs_business());			
		}
	}
	public UserInstagram() { 
	}
	
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getProfilePictureUrl() {
		return profilePictureUrl;
	}
	public void setProfilePictureUrl(String profilePictureUrl) {
		this.profilePictureUrl = profilePictureUrl;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getBio() {
		return bio;
	}
	public void setBio(String bio) {
		this.bio = bio;
	}
	public String getWebsite() {
		return website;
	}
	public void setWebsite(String website) {
		this.website = website;
	}
	public Boolean getBusiness() {
		return business;
	}
	public void setBusiness(Boolean business) {
		this.business = business;
	}


}
