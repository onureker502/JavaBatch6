package com.syntax.class10;

public class Task3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String[][] professions= {
				{"QA Tester" , "Developers", "Product Owner", "Scrum Master"},
				{"Math Teacher" , "Science Teacher", "ESL Teacher"},
				{"Dentist", "Surgeon"}
					
				
				
				
				
		};
		
		
		// get elements using advance loop
		
		
		for(String[] occupation:professions) {
			for(String title:occupation) {
				
				System.out.println(title);
				
			}
			System.out.println();
		}
		
		

	}

}
