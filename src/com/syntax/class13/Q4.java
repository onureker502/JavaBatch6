package com.syntax.class13;

public class Q4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		 * Find out how many alpha characters are present in aString?
		 * 
		 * find number of words in string?
		 * 
		 */
		
		String str="Hig9898hjklmcndjc%%%^     oio";
		
		str=str.replaceAll("[^A-Za-z]", "");
		int number=str.length();
		
		System.out.println("number of alpha character = " + number);
		
		
		
		
		String myString="Today is Wednesday";
		String [] array=myString.split(" ");
		
		
		
		int words= array.length;
		
		System.out.println(words);
	}

}
