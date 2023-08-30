package com.jsp.ExceptionHandling;

public class OverAgeLimitException extends Exception{
	
	@Override
	public String getMessage() {
		return "Age limit exceeded";
	}

}
