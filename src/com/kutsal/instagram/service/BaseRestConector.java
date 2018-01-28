package com.kutsal.instagram.service;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.WebTarget;
import javax.ws.rs.core.GenericType;
import javax.ws.rs.core.MediaType; 

public abstract class BaseRestConector {

	//public final static String BASE_REST_URL = "https://api.instagram.com";
	public final static String BASE_REST_URL = "http://KUD-PC:8081";
  
	private Client client = ClientBuilder.newClient();

	public abstract String getProjectName();

	public abstract String getProjectVersion();

	private WebTarget getBaseWebTarget() {
		return client.target(BASE_REST_URL + getProjectName() + "/" + getProjectVersion());
	}

	protected <T> T getRequest(String serviceName, String operationName, Class<T> arg0, Map<String, String> queryParams, String... pathParams) {
		WebTarget webTarget = getBaseWebTarget().path(serviceName).path(operationName); 
		if(pathParams != null) {			
			for (String pathParam : pathParams) {
				webTarget = webTarget.path(pathParam);
			}			
		}
		
		for (Entry<String, String> entry : queryParams.entrySet()) {
			webTarget.queryParam(entry.getKey(), entry.getValue()); 
		} 
		return webTarget.request(MediaType.APPLICATION_JSON).get(arg0); 
	}

	@SuppressWarnings("unchecked")
	protected <T> List<T> getRequestForCollection(String serviceName, String operationName, Class<T> arg0, Map<String, String> queryParams, String... pathParams) {
		WebTarget webTarget = getBaseWebTarget().path(serviceName).path(operationName);
		if(pathParams != null) {
			for (String pathParam : pathParams) {
				webTarget = webTarget.path(pathParam);
			} 
		}
		for (Entry<String, String> entry : queryParams.entrySet()) {
			webTarget.queryParam(entry.getKey(), entry.getValue()); 
		} 
		 
		T[] a  = (T[]) webTarget.request(MediaType.APPLICATION_JSON).get(new GenericType<T>(Array.newInstance(arg0, 1).getClass()) {});
		List<T> returnList = new ArrayList<T>();
		 for(T t : a) {
			 returnList.add(t);
		 } 
		return returnList;
	}

}