package com.syntax.class15;

public class MethodsReturningValue {

	public static void main(String[] args) {
		
		
		// create a String and base on the length of the String
		//we define whether String is short or long
		
		String str="Hello my friend";
		int length=str.length();
		
		if (length>10) {
			
			System.out.println("long");
		}else {
			
			System.out.println("short");
		}
		//compare 2 numbers and then we identify whether largest number is evenn or odd
		
		
		Methods obj=new Methods();
		//obj.islarger(10, 20);
		
		//int num=obj.largest(12,13);
		
		MethodsReturningValue	newobject=new MethodsReturningValue();
		
		int num =newobject.largest(12, 13);
		
		
		boolean flag=newobject.isOdd(num);
		System.out.println("largest num " + num + "is odd number: "+ flag);
	}

	// create a method that returns largest number from 2 given numbers
	
	int largest (int a , int b) {
		int largest;
		if(a>b) {
			largest=a;
			
		}else {
			largest=b;
		}
		return largest;
		
	}
	boolean isOdd(int num) {
		boolean isOdd;
		if (num%2==0) {
			
			isOdd=false;
			
		}else {
			
			isOdd=true;
		}
		return isOdd;
	}
	
}
