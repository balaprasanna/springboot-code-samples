package com.bala.crudapi;

public class APIError {
	
	private String message;
	public APIError() {
		super();
	}
	
	public APIError(String m) {
		super();
		this.message = m;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}
	
}
