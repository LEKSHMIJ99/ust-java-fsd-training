package com.ust;

 class Switchexample2 {

	public static void main(String[] args) {
		int day=2;
		String dayType = null;
		String dayString;
		switch(day) {
		case 1:
			dayString="MONDAY";
			break;
		case 2:
			dayString="tuesday";
			break;
		case 3:
			dayString="wednesday";
			break;
		case 4:
			dayString="thursday";
			break;
		case 5:
			dayString="friday";
			break;
		case 6:
			dayString="sunday";
			break;
			default:
				dayString="invalid day";
		}
		switch(day) {
		case 1:
		case 2:
		case 3:
		case 4:
		case 5:
			dayType="weekday";
			break;
		case 6:
		case 7:
			dayType="invalid dayType";
		}
		System.out.println(dayString+ "is a" + dayType);
}
 
 
			
			
			
		}
	

