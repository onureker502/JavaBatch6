package com.syntax.class08;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// write a program to calculate sum of odds and sum of even numbers
		//1 to 99
		int evensSum=0;
		int oddsSum=0;
		for(int i=1; i<=99; i++) {
			
			if (i%2==0) {
				evensSum=evensSum+i;
				}else {
					oddsSum=oddsSum+i;
				}
			
		}
	
	System.out.println("sum of evens = " + evensSum );
	System.out.println("sum of odds = " + oddsSum );
	}
	

}
