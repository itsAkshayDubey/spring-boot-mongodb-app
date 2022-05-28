package com.github.itsAkshayDubey.springbootnosql.exception;

public class UserNotFoundException extends RuntimeException{

	/**
	 * 
	 */
	
	private String message;
	private static final long serialVersionUID = 1L;
	
	public UserNotFoundException(String message) {
		super(message);
		this.message = message;
	}
	
	public String getMessage() {
		return this.message;
	}
	
	

}
