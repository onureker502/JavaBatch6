package com.syntax.class07;

public class WhileLoopIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int time = 10;
		
		if (time<12) {
			
			System.out.println("good morning");
			
			
		}
		
		System.out.println("======================while=========");
		
		while( time < 12) {
			
			System.out.println("good morning");
			time++;
			
		}
		
		// how to print numbers 1 to 50?
		
		
		int x=1;
		while (x<51) {
			System.out.println(x);
			x++;
			
			
			// hot to print 20 to 30
			
			int num1 = 20;
			System.out.println("======================while=========");
			while(num1<=30) {
				
				System.out.println(num1);
				
				num1++;
				
				
			}
			System.out.println("*******************");
			
			// how to print 5 to 15 all in 1 line
			
			int num2=5;
			
			while(num2<=15) {
				
				System.out.print(num2 + " ");
				
				num2++;
				
			}
			
			System.out.println("**********");
			// 10 to 1
			int num3=10;
			
			while(num3>=1) {
				
				System.out.println(num3);
				
				num3--;
				
				
				
				
			}
			
			//how to print 50 to 1
			// how to prints odds numbers from 1 to 20'
			System.out.println("**********");
			int num4 =50;
			
			while(num4>=1) {
				
				System.out.println(num4);
				num4--;
				
				
			}
			
			
			System.out.println("**********");
			
			int num5= 1;
			while(num5<20) {
				System.out.print(num5 + " ");
				num5 = num5 + 2 ;
				
				
			}
			System.out.println("**********");
			
			int num6 = 1;
					while(num6<20){
						if(num6 %2 !=0) {
							
							System.out.println(num6);
						}
						num6++;
						
						
					}
			
			
		  }
	}

}
