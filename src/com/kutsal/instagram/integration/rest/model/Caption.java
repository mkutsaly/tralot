

package com.kutsal.instagram.integration.rest.model;

public class Caption {
	
	private String id;
	private String text;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getText() {
		return text;
	}
	public void setText(String text) {
		this.text = text;
	}
	public Caption(String text) {
		super();
		this.text = text;
	}
	public Caption() {
		super();
	}
	 
 
}
