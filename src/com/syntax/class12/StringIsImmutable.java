package com.syntax.class12;

public class StringIsImmutable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String str="Hello";
		String str2="World";
		
		str=str.concat(str2);
		System.out.println(str);

	}

}
