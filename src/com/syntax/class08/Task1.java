package com.syntax.class08;

public class Task1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// write a program that print numbers 1 to 20
		// i do not want to print 5'6'7
		
		
		for(int i=1; i<=20; i++) {
			
			if (i==5 || i==6 || i==7) {
				continue;
				
			}
			System.out.println(i);
		}
	
	System.out.println("-----------------------");
	
	
	// 1to 100 'dont print 35-55
	
	
	for(int a=1; a<=100; a++) {
		
		if(a>=35 && a<=55) {
			continue;
			
			
		} 
		System.out.println(a);
		
		
	}
	}

}
