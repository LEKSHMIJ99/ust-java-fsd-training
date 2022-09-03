package com.ust;

 class Car {
	 String mode1;
	 String colour;
	 int wheels;
	 int seats;
	 String geartype;
	 
	 void display() {
		 
		 
		 System.out.println("in car class");
	 }
	 

}
 
	 

 class Ciaz extends Car{
	 void display () {
		 System.out.println("in ciaz class");
	 }
	 void show() {
		 System.out.println("in show method");
	 }
	 
 }
 
 public class Ertiga extends Car{
 void display() {
		 
System.out.println("in Ertiga class");
super.display();
	 }
	 public static void main(String args[]) {
		 Ciaz C=new Ciaz();
		 
		 C.display();
		 C.show();
		 Ertiga e =new Ertiga();
	     e.display(); System.out.println(e.colour);
		 
		 
	 }
 }