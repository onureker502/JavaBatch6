package com.syntax.class06;

public class SwitchIntro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    
		
		int day = 5;
		String dayName;
		
		if (day==1) {
			
			dayName="monday";
			
		}else if (day==2) {
			 dayName="Tuesday";
			 
			
		}else if (day==3) {
			 dayName="wednesday";
			 
				
		}else if (day==4) {
			 dayName="Thurday";
				
		}else if (day==5) {
			 dayName="friday";
			 
				
		}else if (day==6) {
			 dayName="saturday";
			 
				
		}else if (day==7) {
			 dayName="sunday";
			 
				
		}else {
			
			dayName="invalid;";
		}
		
		System.out.println("today is " +  dayName );
		
		System.out.println("-------using switch -------------");
		
		
		String today;
		
		
		switch(day) {
		
		case 1 :
			today="monday";
			break;
			
		case 2:
			today="tuesday";
			break;
		
		case 3:
			today="wednesday";
			break;
		case 4 :
			today="thursday";
			break;
		case 5:
			today="friday";
			break;
		case 6:
			today="saturday";
			break;
		case 7:
			today ="sunday";
			break;
			
			default :
				today="invalid";
			
		
		
		
		
		
		
		}
		System.out.println("today is " +  today );
		
	}

}
