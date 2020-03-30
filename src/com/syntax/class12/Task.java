package com.syntax.class12;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Sunday";
		char onur;
		
		for (int i=5; i>=0; i--) {
			
			System.out.print(onur=str.charAt(i));
			
			}
		
		System.out.println();

		
		// task 2
		
		
		Scanner input = new Scanner(System.in);
		System.out.println("enter a string please");
		String text=input.nextLine();
		
		if (!text.isEmpty()) {
			if (text.length() % 2 == 1 && text.length()>= 3 ) {
				
				System.out.println(text.charAt((text.length()-1)/2));
				
			} else {
				
				System.out.println("even  number of characters");
			}
			
			
		}
		
		// task 3
		
		Scanner scan = new Scanner(System.in);
		System.out.println("whats the mom name");
		String name1=scan.nextLine();
		
		System.out.println("whats the dad name");
		String name2=scan.nextLine();
		
		System.out.println("Boy or girl");
		String babyName=scan.nextLine();
		String SuggestedBname= null;
		
		int half1 = name1.length() / 2 ;
		int half2 = name2.length() / 2 ;
		
		if(babyName.equalsIgnoreCase("girl")) {
			SuggestedBname = name1.substring(0, half1) + name2.substring(half2);
			System.out.println(SuggestedBname);
			
		}else if (babyName.equalsIgnoreCase("boy")) {
			SuggestedBname = name2.substring(0, half1) + name1.substring(half1);
			System.out.println(SuggestedBname);
			
		}
		
		
		
		
		
	}

}
