package com.syntax.class16;

public class InstanceVariables {
	
	String name="john";// instance variable
	
	public static void main(String[] args) {
		
		String name="yunus";
		System.out.println(name);
		
	InstanceVariables	object=new InstanceVariables();
	
	System.out.println(object.name);
	
	object.name="ali";
	System.out.println(name);
	
	System.out.println(object.name);
	
	name="Farid";
	System.out.println(name);
	
	}

}
