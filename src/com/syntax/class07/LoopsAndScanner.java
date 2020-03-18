package com.syntax.class07;

import java.util.Scanner;

public class LoopsAndScanner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// we want to ask user's name 5 times and print good afternoon ______;
		
		Scanner input;
		String name;
		int num=1;
		
		input=new Scanner(System.in);
		
		
		
		
			
		System.out.println("whats your name");
		
		
		
		name=input.nextLine();
		
		while(num<=5) {
		System.out.println("good afternoon " + name);
		
		num++;
		}
		
		
		// WE ARE playing a lottery and a lucky number is 17;
		// we want to keep asking user any number 1-20 until he guess the lucky number
		// congrasss
		
	
		
		
		
		
	}

}
