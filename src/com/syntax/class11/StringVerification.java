package com.syntax.class11;

public class StringVerification {
	
	public static void main(String[] args) {
		
		
		String message="Welcome Admin";
		
		// verify that message contains username which is Admin
		
		System.out.println(message.contains("Admin"));
		
		boolean flag = message.contains("Welcome");
		
		System.out.println(flag);
		
		
		// // we want to see if welcome starts with welcome
		
		boolean starts=message.startsWith("Welcome");
		
		System.out.println("yessss "+ starts);
		
		//we want to verify that welcome message ends with username and !
		
		String username="Admin";
		
		boolean ends=message.endsWith(username);
	
	System.out.println(ends);
	}
	

}
