package com.syntax.class07;

public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean workDay= true;
		int varibleDay = 1;
		while(workDay) {
			
			if (varibleDay<6) {
				
				System.out.println("i need a day off");
			}else {
				System.out.println("i do not need a day off anymore");
				workDay = false;
				
			}
			varibleDay++;
			
		}
		
		
	}

}
