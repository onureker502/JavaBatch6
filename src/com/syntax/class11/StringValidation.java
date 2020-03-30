package com.syntax.class11;

public class StringValidation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str1="Welcome Syntax students";
		
		String str2="Welcome Syntax Students";
		
		// to compare 2 Strings
		
		System.out.println("-----equals() equalasIgnoreCase()  Function------");
		
		
		System.out.println(str1.contentEquals(str2));
		
		System.out.println(str1.equalsIgnoreCase(str2));
		
		
		String expected="Home - Syntax Technologies";
		String actual="Home - Syntax Technologies   ";
		
		if (actual.equals(expected)) {
			
			System.out.println("Test case pass.");
		}else {
			
			System.out.println("test case fails");
		}
		if (actual.trim().equals(expected)) {
			
			System.out.println("test case pass");
		}else {
			
			System.out.println("test case fails");
		}
		
	}

}
