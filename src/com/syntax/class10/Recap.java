package com.syntax.class10;

public class Recap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] grades=new int[4];
		
		grades[0]=90;
		grades[1]=67;
		grades[2]=89;
		grades[3]=78;

		// what is averages?
		
		int average = ( grades[0]+ grades[1] + grades[2] +grades[3]) / 4;
		System.out.println("Average grade is " + average);
		
		
		//--------------
		
		System.out.println("------Creating an array of cities-----");
		
		String [] cities= {"Washington DC", "New York", "Paris", "Miami", "Los Angeles", "Dallas", "Chantilly"} ;
		
		// i live in paris
		
		
		System.out.println("I live in " + cities[2]);
		
		
		int x=1;
		System.out.println(cities[x]);
		
		x+=3;
		System.out.println("i moved to " + cities[x]);
		
		
		// how many elements stored inside an array?
		
		int arraySize= cities.length;
		
		System.out.println("total elements "+ arraySize);
		
		// how can we acces last element from array
		
		System.out.println(cities[arraySize-1]);
		
		//acces all elements
		
		for (int i=0; i<arraySize; i++) {
			
			System.out.println(cities[i]);
		}
			
		
		
		
	}

}
