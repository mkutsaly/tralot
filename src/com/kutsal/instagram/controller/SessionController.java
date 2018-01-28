package com.kutsal.instagram.controller;
 
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;

import com.kutsal.instagram.model.User;

@SessionScoped
@ManagedBean(name = "sessionController")
public class SessionController {
	 
	private String accessToken;
	private User loginUser; 
	
	public String getAccessToken() {
		return accessToken;
	}
	public void setAccessToken(String accessToken) {
		this.accessToken = accessToken;
	}
	public User getLoginUser() {
		return loginUser;
	}
	public void setLoginUser(User loginUser) {
		this.loginUser = loginUser;
	}
 
	public void init() {
		HttpServletRequest httpRequest = (HttpServletRequest)FacesContext.getCurrentInstance().getExternalContext().getRequest();
		setLoginUser((User) httpRequest.getSession().getAttribute("USER"));
		setAccessToken((String) httpRequest.getSession().getAttribute("AT"));
		
	}
 
	
}
