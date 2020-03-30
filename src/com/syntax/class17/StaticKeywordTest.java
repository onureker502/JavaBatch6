package com.syntax.class17;

public class StaticKeywordTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//access static members of another class
		
		StaticKeyword.brand="Android";
		StaticKeyword.touchScreen=true;
		
		StaticKeyword.displayGenaralInfo();
		
		// access instance members of other class
		
	StaticKeyword	sk=new StaticKeyword();
	
	sk.color="red";
	sk.memory=128;
	sk.displaySpecifications();
		
	}

}
