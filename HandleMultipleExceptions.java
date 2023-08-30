package com.jsp.ExceptionHandling;

public class HandleMultipleExceptions {

	public static void main(String[] args) {
		
		int m=24;
		int n=2;
		String s="";
		
		try {
			int res=m/n;
			System.out.println(res);
			char c = s.charAt(5);
		}
		catch(ArithmeticException e) {
			System.out.println(e.getMessage());
		}
		catch(StringIndexOutOfBoundsException e) {
			System.out.println(e.getMessage());
		}
		catch(RuntimeException e) {
			e.printStackTrace();
		}
		catch(Exception e) {
			e.printStackTrace();			
		}
		catch(Throwable e) {
			e.printStackTrace();
		}
		
	}

}
