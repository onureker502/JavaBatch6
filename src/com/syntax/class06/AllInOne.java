package com.syntax.class06;

import java.util.Scanner;

public class AllInOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		/*write a program to ask user if there is a sale
		 * if no sale----> not going sale
		 * if sale ---> we will ask the price of the item
		 * based on the price we willl apply discount and calculate final price
		 * 
		 * if price less than 20 ----> apply %10
		 * if price between 20-100 ----> apply %20
		 *                 100-500 ---> appley %30
		 *                 500 up ---->  apply %50
		 *                 
		 * after discount ----- the price of the item reduced from __ to ___ 
		 * 
		 */
		
		
		
		Scanner scan;
		String sale;
		double price;
		double discount;
		double finalPrice;
		
		scan = new Scanner (System.in);
		System.out.println("is there a sale");
		sale = scan.nextLine();
		
		
		if (sale.equalsIgnoreCase("yes")) {
			System.out.println("what is the price");
			price = scan.nextDouble();
			
			if (price <= 20) {
			
				discount = price *0.1;
				
			}else if (price>20 && price <=100) {
			discount = price*0.2;
			
			}else if(price>100 && price <= 500) {
			
				discount = price*0.3;
				
			}else {
				
				discount = price*0.5;
				
			}
			finalPrice=price-discount;
			System.out.println("after  " + discount + " disvount the price of the item reduced from yes " 
					+ price + " to " + finalPrice);
			
		}else { 
			System.out.println("no shopping today");
			
		}
		
		
		
	}

}
