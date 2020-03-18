package com.syntax.class08;

import java.util.Scanner;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner scan = new Scanner(System.in);
		for(int i=1; i<=10; i++) {
			System.out.println("do you wanna apply for credit card");
			String creditCard= scan.next();
			if(creditCard.equals("yes")) {
				
				System.out.println("congratulations");
				break;
				
			}
				
			
			
		}
		
	}

}
