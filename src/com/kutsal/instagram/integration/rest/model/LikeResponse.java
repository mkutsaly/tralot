package com.kutsal.instagram.integration.rest.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown=true)
public class LikeResponse {

	private List<Datum> data;

	public List<Datum> getData() {
		return data;
	}

	public void setData(List<Datum> data) {
		this.data = data;
	}
	
	
}
