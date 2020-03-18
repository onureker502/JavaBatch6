package com.syntax.class07;

import java.util.Scanner;

public class HW {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner scan;
		double num;
		double num1;
		double result=0;
		
		char operator;
		
		scan = new Scanner(System.in);
		System.out.println("==CALCULATOR==");
		System.out.println("please enter two number & an aritmatic operator");
		System.out.println("==============================================");
		System.out.println("number 1");
		num = scan.nextDouble();
		System.out.println("choose from (+'-'*'/)");
		operator = scan.next().charAt(0);
		System.out.println("number 2");
		num1 = scan.nextDouble();
		scan.close();
		
		switch (operator) {
		case  '+' :
			result= num + num1;
			break;
		case '-' :
			result = num - num1;
			break;
		case '*' : 
			result = num * num1;
			break;
		case '/' : 
			result= num / num1;
			break;
			default:
				
				System.out.println("you have entered wrong operator");
				
			}
		System.out.println("result is  " +   result ); 
		

	}

}
