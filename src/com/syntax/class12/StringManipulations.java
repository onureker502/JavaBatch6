package com.syntax.class12;

public class StringManipulations {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str="Good Morning Students!";
		
		char letter1=str.charAt(0);
		
		System.out.println(letter1);
		
		char letter5=str.charAt(4);
		System.out.println(letter5);
		
		// get all character 1 by 1 from string
		char letters;
		
		for(int i=0; i<str.length(); i++) {
		
			
			letters=str.charAt(i);	
			System.out.print(letters+ " ");
			
		}
System.out.println();

    System.out.println("======indexOf()    function  =======");
    
    String name= "Syntax Technolojies";
    
    int index=name.indexOf("y");
System.out.println(index);



index= name.indexOf(" ");
System.out.println(index);

	index=name.indexOf("Technolojies");
System.out.println(index);

	}

}
