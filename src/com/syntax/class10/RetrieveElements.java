package com.syntax.class10;

public class RetrieveElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		
		char[] grades= { 'A', 'B', 'C', 'D', 'E', 'F'};
		
		//GETTING ALL ELEMENTS
		
		
		for (int i=0; i<grades.length; i++) {
			
			System.out.println(grades[i]);
		}
		
		
		System.out.println("-----printing using advanced for loops-------");
		
		//****************************************************************************
		
		
		
		for(char grade:grades) {
			
			System.out.print(grade+ " ");
		}
		
		System.out.println();
		//create an array of fruits and retrieve all elements
		
		String[] fruits= {"banana", "kiwi" , "apple" ,"mango"};
		
		
		// if fruits is apple-----> thats favorite fruit
		
		for (String fruit:fruits) {
			if(fruit.equals("apple")) {
				
				System.out.println(fruit + "is your favo fruitss");
			}else {
				
			
			System.out.println(fruit);
			}
		}
		
		
		System.out.println("------------");
		
		
		for (int i=0; i<fruits.length; i++) {
			
			System.out.println(fruits[i]);
		}
		
	}

}
