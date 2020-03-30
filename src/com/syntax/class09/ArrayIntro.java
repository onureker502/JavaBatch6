package com.syntax.class09;

public class ArrayIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// declare an array and initialize it and store values
		
		int[] array=new int[4];
		array[0]=10;
		array[1]=20;
		array[2]=30;
		array[3]=40;
		
		//access elements from an array
		System.out.println(array[1]);
		
		// second way
		
		String[] carArray;  // prefered way
		String carArray1[];
		
		carArray= new String[3];
		carArray[0]="BMW";
		carArray[1]="honda";
		carArray[2]="toyota";
		
		
		System.out.println("i am driving " + carArray[2]);
		
		
		////////////////
		
		
		int[] numbers=new int[6];
		
		numbers[0]=100;
		numbers[1]=200;
		numbers[2]=300;
		
		// changes value of numbers[1]

		numbers[1]=2000;
		
		System.out.println(numbers[3]);
	
	}

}
