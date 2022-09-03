package com.ust;
import java.util.Scanner;
class Datatype2{
	public static void main(String[ ]args) {
		Scanner Input =new Scanner(System.in) ;
	//Getting float input
		System.out.println("Enter float:");
		float myFloat=Input.nextFloat();;
		System.out.println("Float entered="+ myFloat);
		//getting double input
		System.out.println("Enter double:");
		double myDouble=Input.nextDouble();
		System.out.println("Double entered="+ myDouble);
		//Getting string input
		System.out.println("Enter text:");
		String mystring=Input.next();
		System.out.println("Text entered="+ mystring);
			
		}
	
}



