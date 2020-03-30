package com.syntax.class14;

public class Garage {

	public static void main(String[] args) {
		
		
		//building individual objects 
	Car	car1=new Car();
		car1.make="Lamborghini";
		car1.model="Gallardo";
		car1.year=2020;
		car1.color="blue";
	
		
	Car	car2=new Car();
		car2.make="BMW";
		car2.model="M5";
		car2.year=2019;
		car2.color="pink";
		
	Car	car3=new Car();
		car3.model="123";
		car3.speed=200;
		
		//print BMW
		
		System.out.println(car2.make);
		
		// access the car behavior / methods of Car 
		car1.drive();
		car1.accelerate();
		car1.makeNoise();
		car1.stop();
		
		
		car2.drive();
		car2.accelerate();
		car2.makeNoise();
		car2.stop();
		
		
		// i drive pink BMW
		System.out.println("i drive "+ car2.color +" " + car2.make);
		
	Car2	anotherCar=new Car2();
		anotherCar.make="Toyota";
		anotherCar.speed=50;
		anotherCar.drive();
		
		
	
	
	}

}
