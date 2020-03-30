package com.syntax.class11;

import java.util.Scanner;

public class Task {

	public static void main(String[] args) {
		
		Scanner scan;
		String username;
		String password;
		String confirmedPassword;
		String message=null;
		
		scan=new Scanner(System.in);
		
		System.out.println("please enter user name");
		username=scan.nextLine();
		
		
		System.out.println("please enter password");
		password=scan.nextLine();
		

		if(!(username.isEmpty() || password.isEmpty())) {
			
			if (password.length() >=8) {
				
				
				if(!password.contains(username)) {
					
					
					System.out.println("please confirm password");
					confirmedPassword=scan.nextLine();
					if(password.equals(confirmedPassword)) {
						
						System.out.println("your accound created");
					}else {
						
						System.out.println("passwords are not match");
					}
					
				}else {
					
					System.out.println("password cannot contain username");
				}
				
				
			}else {
				System.out.println("password is too short");
				
			}
			
			
			
		}else { 
			message="username and password cannot be empty";
			
			
		}
		
		System.out.println(message);
	}

}
