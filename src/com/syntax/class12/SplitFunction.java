package com.syntax.class12;

public class SplitFunction {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String today="Today is my favorite JAva Class";
		
		String[] array=today.split("my");
		
		System.out.println(array.length);
		
		System.out.println(array[0]);
		System.out.println(array[1]);
		
		String today1="Today is my favorite Java Class";
		
		String[] stringArray=today1.split("a");
		
		// print all elemenets 1 by1 
		System.out.println(stringArray.length);
		
		for(String arr:stringArray) {
			
			System.out.println(arr);
		}
		
		// we want to print String word by word
		
		String today2="Today is my favorite JAva Class";
		
		
		String [] words=today2.split(" ");
				
		for (int i=0; i<words.length;i++) {
			
			System.out.println(words[i]);
		}
				
	}

}
