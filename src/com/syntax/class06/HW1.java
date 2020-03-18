package com.syntax.class06;

import java.util.Scanner;

public class HW1 {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println("enter nyour birth of month");
		String month=scan.nextLine();
		String season;
		
		if ((month.equals("january")) || (month.equals("february"))  || (month.equals("december"))) {
			season="winter";
		}
		else if ((month.equals("april")) || (month.equals("may"))  || (month.equals("march"))) {
			season="spring";
		}
		else if ((month.equals("june")) || (month.equals("july"))  || (month.equals("august"))) {
			season="summer";
		}
		else if ((month.equals("september")) || (month.equals("october"))  || (month.equals("november"))) {
			season="autumn";
		} else {
			season="wrong";
			
		}
		System.out.println("you were born in  " +  season);
	}
}
