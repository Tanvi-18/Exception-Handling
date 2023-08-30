package com.jsp.ExceptionHandling;

public class UnderAgeLimitException extends Exception {
	
	@Override
	public String getMessage() {
		return "Age cannot be below 20";
	}

}
