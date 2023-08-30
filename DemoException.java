package com.jsp.ExceptionHandling;

public class DemoException {
	
	public static void main(String[] args) {
		
		int m=20; int n=0;
		
	//  finally{} will execute irrespective of the Exception is being handled or not 
		
		try {
			int res=m/n;
			System.out.println(res);
			System.out.println("To be executed");
		}
		catch(StringIndexOutOfBoundsException e){
			System.out.println(e.getMessage());
		}
		finally {
			System.out.println("Program Ends!");
		}
		
	}

}
