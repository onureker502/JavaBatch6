package com.syntax.class10;

public class Task {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] numbers = { 27,43, 87, 322, 6, 32, 65, 85, 54,7};
		int sum=0;
		
		for (int i : numbers) {
			
			sum+=i;
		}
			System.out.println("the sum of the numbers in this arrayis " + sum);
			
		System.out.println("using another loop");
		int sum1=0;
		
		for (int i=0; i<numbers.length; i++) {
			
			sum1 +=numbers[i];
			
			
			
		}

		System.out.println("the sum of the numbers in this arrayis " + sum1);
		
		
	}

}
