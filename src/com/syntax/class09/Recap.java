package com.syntax.class09;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		for (int i=1; i<=3; i++) {
			
			for(int j=1; j<=3; j++) {
				
				System.out.println(i + " " + j );
				
			}
		}
	
	// usuing nested loop to print 10 to 99
		
		for(int a =1; a<=9; a++) {
			
			for (int b=0;b<=9; b++) {
				
				System.out.println(a+ "" +b);
			}
		}
	System.out.println("-------------");
	
	// using nested loop to print clock
	
	
	for(int x=0; x<24; x++) {
		
		for(int y=0; y<60; y++) {
			if (y<10) {
				System.out.println(x+":0"+y);	
			}else {
				System.out.println(x+":"+y);
			}
			
		}
		
	}
	
	
	System.out.println("--------------");
	
	// using nested loops to print car odometer
	
	
	}

}
