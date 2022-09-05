package com.ust;

public class Animal_2 {
public void display() {
	
}
}
class dog1 extends Animal_2{
	public void display() {
		System.out.println("iam a dog");
		
	}
	public void printMessage() {
		display();
		super.display();
		
	}
}
class Main7{
	public static void main(String[] args) {
		dog dog1=new dog();
		dog1.printMessage();
	}
}