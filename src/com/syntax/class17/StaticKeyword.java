package com.syntax.class17;

public class StaticKeyword {
	
	// create a template for a Phone
	
	
	String color;
	int memory;
	
	static String brand;
	static boolean touchScreen;
	
	// return type, name,parameters
	
	static void  displayGenaralInfo() {
		
		System.out.println("we are buuilding " + brand + " with touch screen " + touchScreen);
	}
	
	void displaySpecifications() {
		
		System.out.println("we build phone with " + memory + " GB memory in " + color+ "color");
		
		
	}

	public static void main(String[] args) {
		
		
		brand="iphone";
		touchScreen=true;
		
		StaticKeyword obj=new StaticKeyword();
		
		obj.color="grey";
		obj.memory=64;
		
		//accesing static method in a static way
		displayGenaralInfo();
		obj.displaySpecifications();
		obj.displayGenaralInfo();
		
		
	}
	
	
}
