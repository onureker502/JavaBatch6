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
}
