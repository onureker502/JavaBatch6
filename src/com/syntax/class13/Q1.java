package com.syntax.class13;

public class Q1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// write a program to swap 2 numbers without a temporary variable?
		  // swap 2 Strings without a temporary varible  
		
		
		
		int a =10;
		int b= 20;
		
		a=a+b; // 30
		b=a-b; // 30-20=10
		a=a-b; 
		
		System.out.println("the value of a = " + a);
		System.out.println("the value of b = " + b);
		
		
		
		String str1 = "Day";
		String str2 = "Night";
		
		str1=str1+str2;
		str2=str1.substring(0, str1.length()-str2.length());
		str1=str1.substring(str2.length() );
		System.out.println("the value of str1 = " + str1);
		System.out.println("the value of str2 = " + str2);
		
		
	}

}
