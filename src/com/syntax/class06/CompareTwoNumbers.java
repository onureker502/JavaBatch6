package com.syntax.class06;

import java.util.Scanner;

public class CompareTwoNumbers {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub

		Scanner scan=new Scanner(System.in);
		System.out.println("please enter first number");
		double num1;
		num1 =scan.nextDouble();
		
		System.out.println("please enter second number");
		double num2;
		num2 =scan.nextDouble();
		
		System.out.println("please enter third number");
		double num3;
		num3 =scan.nextDouble();
		
		double largest=0;
		
		if (num1>num2 && num1>num3) {
			largest= num1;
			
		}else if (num2>num1 && num2>num3) {
			largest= num2;
		}else if (num3>num2 && num3>num1) {
			largest= num3;
		}
		System.out.println("largest number is " +  largest);
	}

}
