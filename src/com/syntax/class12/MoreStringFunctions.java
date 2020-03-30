package com.syntax.class12;

public class MoreStringFunctions {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String me=" I am a good tester";
		
		System.out.println("------replace() function");
		
		String newString=me.replace("a", "c");

		System.out.println(newString);
		
		me=me.replace("good", "great");
		
		System.out.println(me);
		
		
		System.out.println("=====replaceAll()======");
		
		
		String str="Phone number is 1234567890";
		str=str.replaceAll("[A-Za-z]", "");
		
		System.out.println(str);
		
		
		String str1="Hello1234**&&*   !!!!*90";
		str1=str1.replaceAll("[0-9]", "");
		System.out.println(str1);
		
		str1=str1.replaceAll("[^A-Za-z]", "");
		System.out.println(str1);

	}

}
