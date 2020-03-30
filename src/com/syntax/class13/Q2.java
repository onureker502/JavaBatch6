package com.syntax.class13;

public class Q2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		/*
		 * write a java program to check whetter a given number is prime or not?
		 * 
		 * prime number is a number that is greater than 1
		 * prime number should meet 2 conditions divisible by 1  and itself only
		 * 2 3 5 7 11  13 17 
		 * 
		 */

		
		int given = 2;
		
		boolean isPrime =true;
		
		if (given>1) {
			
			for (int i=2; i<given; i++) {
				
				if(given%i==0) {
					
					isPrime=false;
					break;
					
				}
			}
			
			
		}else {
			
			isPrime = false;
			
		}
		System.out.println("given number " +given+" is prime? " +isPrime);
		
	}

}
