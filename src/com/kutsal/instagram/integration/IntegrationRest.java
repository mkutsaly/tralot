package com.kutsal.instagram.integration;


import java.io.BufferedReader;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.faces.context.FacesContext;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;

import com.google.gson.Gson;
import com.kutsal.instagram.controller.SessionController;
import com.kutsal.instagram.integration.rest.model.TokenResponse;
import com.kutsal.instagram.model.User;
import com.kutsal.instagram.service.UserService;

@Path("test")
@Produces(MediaType.APPLICATION_JSON)
@Consumes(MediaType.APPLICATION_JSON)
@Stateless
public class IntegrationRest {
	
	@EJB
	private UserService userService;
  

	//Server-side (Explicit) Flow
	// https://api.instagram.com/oauth/authorize/?client_id=eef7eff6cfe64a309dee5820ab6e5f2e&redirect_uri=http://localhost:8080/instagramDeneme/rest/test/callback&response_type=code

	
	//Client-Side (Implicit) Authentication
	// https://api.instagram.com/oauth/authorize/?client_id=eef7eff6cfe64a309dee5820ab6e5f2e&redirect_uri=http://localhost:8080/instagramDeneme/rest/test/callback&response_type=token
  
	private String clientID = "eef7eff6cfe64a309dee5820ab6e5f2e";
	private String clientSecret = "fab71cd08d69493494ae37f6caa4bc85";
	private String redirectURI = "http://46.45.156.186:58080/instagramDeneme/rest/test/callback";
 
	@Context
	private HttpServletResponse httpResponse; 

	@Context
	private HttpServletRequest httpRequest;
	
	@GET
	@Path("/callback")
	@Produces(MediaType.APPLICATION_JSON)
	public String callback(@QueryParam("code") String code) throws IOException {
	 
	System.err.println(code);
	String httpurl = "https://api.instagram.com/oauth/access_token?"
	               + "client_id=" + clientID
	               + "&client_secret=" + clientSecret
	               + "&grant_type=authorization_code"
	               + "&redirect_uri=" + redirectURI
	               + "&code="+ code;

	       URL url = new URL(httpurl);
	       HttpURLConnection conn = (HttpURLConnection) url.openConnection();
	       conn.setRequestMethod("POST");

	       String urlParameters = "client_id=" + clientID
	               + "&client_secret=" + clientSecret
	               + "&grant_type=authorization_code"
	               + "&redirect_uri=" + redirectURI
	               + "&code="+code;

	       conn.setRequestProperty("Content-Type", "application/x-www-form-urlencoded"); 
	       conn.setRequestProperty("charset", "utf-8");
	       conn.setRequestProperty("Content-Length", "" + Integer.toString(urlParameters.getBytes().length));

	       conn.setDoOutput(true);
	       DataOutputStream wr = new DataOutputStream(conn.getOutputStream ());
	       wr.writeBytes(urlParameters);
	       wr.flush();
	       wr.close();

	       BufferedReader in = new BufferedReader(new InputStreamReader(
	               conn.getInputStream()));
	
	       String stringResponse = org.apache.commons.io.IOUtils.toString(in);

	       Gson gson = new Gson();
	       TokenResponse response = gson.fromJson(stringResponse, TokenResponse.class);
	       User user = userService.crateOrUpdateUser(response);

	       httpRequest.getSession().setAttribute("USER", user);
	       httpRequest.getSession().setAttribute("AT", response.getAccess_token());
   

	       httpResponse.sendRedirect("/instagramDeneme/liked.xhtml"); 
	       return stringResponse;
	}
	
}
