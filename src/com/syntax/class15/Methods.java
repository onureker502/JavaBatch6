package com.syntax.class15;

public class Methods {

	//create a method that will say welcome 10 times
	
	
	void sayWelcome() {
		
		for(int i=0; i<=10; i++) {
			
			System.out.println("welcome");
		}
	}
	
	// create method that will say any word #numbers of times
	
	void sayAnythings(String word, int times) {
		
		for(int i=1; i<=times; i++)
			System.out.println(word);
	}
	
	
	// create a method isItRaining
	//that will accept boolean value as a param
	// and based on the value it will print message accordingly
	
	void isItRaining(boolean isRain) {
		
		if(isRain) {
			
			System.out.println("it is Raining stay home and learn java");
		}else {
			
			System.out.println("its not raining go for walk");
		}
		
		
	}
	
	void evenOrOdd (int a) {
		if (a%2==0) {
			
			System.out.println(a+ " is an even number");
		}else {
			
			System.out.println(a+ " is an odd number");
		}
		
	}
	void islarger (int a, int b) {
		
		if (a<b) {
			System.out.println(b+ " is larger than "+a);
		}else if(a>b) {
			System.out.println(a+ " is larger than "+b);
		}else {
			System.out.println("equal");
		}
	}
	
}
