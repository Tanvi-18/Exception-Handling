package com.jsp.ExceptionHandling;

import java.util.Scanner;

public class Matrimony {
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your present age");
		int age = sc.nextInt();
		
		if(age<=20) {
			
			try {
				throw new UnderAgeLimitException();
			}
			catch(UnderAgeLimitException e){
				e.printStackTrace();
				System.out.println(e.getMessage());			
			}
		}
		else if(age>45) {
			
			try {
				throw new OverAgeLimitException();
			}
			catch(OverAgeLimitException e) {
				e.printStackTrace();
				System.out.println(e.getMessage());
			}
		}
		else {
			System.out.println("Good to go!");
		}
		
	}

}
