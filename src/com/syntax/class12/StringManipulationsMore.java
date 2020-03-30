package com.syntax.class12;

public class StringManipulationsMore {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.out.println("========substring() Function=====");
		
		String str="Today is a rainy day";
		String partialStrings=str.substring(6);
		System.out.println(partialStrings);

		
		// today
		
		String onur=str.substring(0, 5);
		System.out.println(onur);
		//rainy
		String onur1=str.substring(11, 16);
		System.out.println(onur1);
		
		
		
	}

}
