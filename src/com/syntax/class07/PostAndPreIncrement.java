package com.syntax.class07;

public class PostAndPreIncrement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int z;
		
		int y =10; 
		z=y++;   // postincrement first use the varible then increment
		System.out.println(z);
		
		int w;
		
		int x=10;
		w=++x;
		System.out.println(w);
		
		System.out.println("-----------");
	int num=1;
	while(num<5) {
		
		++num;
		System.out.println(num);
		
	}
		
	System.out.println("-----------");
	int num1=1;
	while(num1<5) {
		
		
		System.out.println(num1);
		
		num1++;
	}
	}

}
