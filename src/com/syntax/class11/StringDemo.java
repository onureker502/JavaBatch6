package com.syntax.class11;

public class StringDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String school = " Syntax ";
		String str=new String("Hello");
		String str1= "This a String 7676,&&^&&";
		
		
		// how many characters String has
		
		System.out.println(school.length());
		
		
		int size=str.length();
		
		System.out.println("String size is " + size);
		
		
		// convert String to lowercase or upper case
		
		System.out.println(school.toUpperCase());
		
		System.out.println(str.toLowerCase());
		
		//concatinate 2 String
		
		
		String newString=str+school;
		
		System.out.println(newString);
		
		
		String day="Saturday";
		
		String date="14";
		
		String newDate=day.concat(date); /// ************************
		
		System.out.println(newDate);
		
		
		System.out.println("-----isEmpty FUNCTION-----");
		
		String str3="";
		
		boolean empty=str3.isEmpty();
		System.out.println(empty);
			System.out.println("trim()   ");	
		// trim function
		
		String str4="   welcome to Syntax!     " ;
		System.out.println(str4 );
		str4=str4.trim();
		
		System.out.println(str4);
		
		
	}

}
