package com.java.server.main.service;

/*
 * Response Class to hold the success response
 * 
 * */

import java.util.List;

public class ResponseClass {
	private String message;
    private List<String> details;
    
    public ResponseClass(String message, List<String> details) {
        super();
        this.message = message;
        this.details = details;
    }
  
    public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public List<String> getDetails() {
		return details;
	}
	public void setDetails(List<String> details) {
		this.details = details;
	}
}
