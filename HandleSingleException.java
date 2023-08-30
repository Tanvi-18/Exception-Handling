package com.jsp.ExceptionHandling;

public class HandleSingleException {
	
	public static void main(String[] args) {
		
		int m=24;
		int n=0;
		
		try {
			int res=m/n;
		}catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		
	}

}
