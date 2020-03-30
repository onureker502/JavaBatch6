package com.syntax.class14;

public class MethodExamples {
	
	// want to create a method that will be greeting a person
	
	void greet() {
		
		System.out.println("hello Sarmed");
	}
	void greet1(String name) {
		
		System.out.println("hello "+name);
	}

	public static void main(String[] args) {
		//how do i call method greet?----> first we need to create an object of the class
		
		MethodExamples object1=new MethodExamples();
		object1.greet1("Sarmet");
		object1.greet1("Faisal");
		object1.greet1("John");
		object1.greet1("Onur");
		
	}
}
