package com.kutsal.instagram.service;

import java.util.HashMap;
import java.util.Map;

import javax.ejb.Stateless;

import com.kutsal.instagram.integration.rest.model.LikeResponse;

@Stateless
public class LikedRestServiceConnector extends BaseRestConector { 

	private String queryParamAccesstoken = "access_token";

	public LikeResponse getLikeResponse(String accessToken) {
		
		Map<String, String> queryParams = new HashMap<>();
		queryParams.put(queryParamAccesstoken, accessToken);
		 
		return getRequest("media", "liked", LikeResponse.class, queryParams, null); 	 
	} 
 
	@Override
	public String getProjectName() { 
		return "/v1/users";
	}

	@Override
	public String getProjectVersion() { 
		return "self";
	}

}