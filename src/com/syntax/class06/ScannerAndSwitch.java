package com.syntax.class06;

import java.util.Scanner;

public class ScannerAndSwitch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*ask user gender: M or F 
		 * based on gender provide description
		 * 
		 * 
		 */

		Scanner scan;
		char gender;
		String genderType;
		
		scan=new Scanner(System.in);
		System.out.println("please enter gender M or F");
		gender= scan.next().charAt(0);
		
		switch (gender) {
		
		case 'M' : 
			genderType= "male";
			break;
		case 'F'  : 
			genderType= "female";
			break;
			default:
				genderType= "unknown";
				
				}
		
		System.out.println("your gender is  " +  genderType);
		
		
	}

}
