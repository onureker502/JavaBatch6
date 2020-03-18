package com.syntax.class08;

import java.util.Scanner;

public class LoopReview {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*
		 * 
		 * ask a user to pay for a candy
		 * as long as the entered price is not 2
		 * we need keep ask for paying
		 * one amount is correct --->"enjoy your candy"
		 
		 */

	Scanner s;
	double price;
	
	s=new Scanner(System.in);
	/*
	do {
	System.out.println("please pay for a candy");
	price=s.nextDouble();
	
	}while(price!=2);
	System.out.println("enjoy your candy1");
	*/
	System.out.println("please pay for a candy");
	price=s.nextDouble();
	
	while(price!=2) {
		System.out.println("pay for candy");
		price=s.nextDouble();
	}
	
	
	
	
	
	
	
	
	}

}
