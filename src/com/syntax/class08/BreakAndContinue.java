package com.syntax.class08;

public class BreakAndContinue {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// once i=4 ---> we want to stop loop
		
		for (int i=1; i<=10; i++) {
	
			
			if (i==4) {
				System.out.println("i am stopping loop");
				break;
			}
	System.out.println(i);
}
		System.out.println("i am outside of the loop");
		
		
		
		
		System.out.println("------------CONTUNUE---------");
	
	for(int y=1;y<=10; y++) {
		
		if(y==4) {
			
			System.out.println("i am skipping iteration");
			continue;
			}
		System.out.println(" inside the loops");
		System.out.println(y);
	}
	
	
	
	
	}

}
