package com.syntax.class06;

import java.util.Scanner;

public class SwitchWithStrings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
/*ask a user where he or she is from
 * based on the country we will define favorite food
 * your favorite food is ____ 
 */
	Scanner scan;
	String country;
	String favoriteFood;
	
	
	scan= new Scanner(System.in);
	System.out.println("please enter your country");
	country=scan.nextLine();
	
	
	switch (country) {
	
	case "morocco" :
		favoriteFood= "couscous";
		break;
	case "belarus":
		favoriteFood="potato";
		break;
	case "tajikistan":
		favoriteFood="osh";
		break;
		
	default:
		favoriteFood="unknown";
		
	case "turkey":
		favoriteFood="baklava";
		break;
		
		
			
	
	}
	
	
	System.out.println("your favorite food is " +   favoriteFood );
	
		
		
	}

}
