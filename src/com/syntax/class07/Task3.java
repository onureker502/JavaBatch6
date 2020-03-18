package com.syntax.class07;

import java.util.Scanner;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		// WE ARE playing a lottery and a lucky number is 17;
		// we want to keep asking user any number 1-20 until he guess the lucky number
		// congrasss
		
		
		Scanner scan;
		int number;
		int luckyNumber=17;
		scan=new Scanner(System.in);
		
		
		do {
			System.out.println("please enter any number from 1 to 20");
			number=scan.nextInt();
			
			
			
			
		}while(number!=luckyNumber);
		
			
			System.out.println("congratulations you win");
	}

}
