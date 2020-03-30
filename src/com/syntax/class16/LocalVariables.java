package com.syntax.class16;

public class LocalVariables {

	void nameInside() {
		
		String name="John";//local variable that visible only within method it was declared
		
	}
	public static void main(String[] args) {
		
	//	System.out.println(name);   name wont be visible to other method 
		// since its scope only within nameInside method
		
		LocalVariables obj=new LocalVariables();
	    obj.nameInside();
		
		boolean flag=true;
		
		if(flag) {
			String answer="yes";
			
		}
	//	System.out.println(answer);its not visible out side of if blog
		
		
		
	}
	
}
