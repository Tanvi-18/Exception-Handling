package com.jsp.ExceptionHandling;

public class ThrowsException {

	//	throws keyword - used to declare an Exception to be thrown to the caller
		
		public static void main(String[] args) throws 
			ArithmeticException, StringIndexOutOfBoundsException {
			
			int m=24; int n=10; String s ="";
			
			System.out.println(m/n);
			System.out.println(s.charAt(5));
		
	}
}

