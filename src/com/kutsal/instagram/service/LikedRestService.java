package com.kutsal.instagram.service;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import com.kutsal.instagram.integration.rest.model.LikeResponse;

@Stateless
public class LikedRestService {

	@EJB
	private LikedRestServiceConnector likeServiceConnector;

	public LikeResponse getLikeResponse(String accesstoken) {
		return likeServiceConnector.getLikeResponse(accesstoken);
	}
}
