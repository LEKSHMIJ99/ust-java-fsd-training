package com.ust;

public class Animal_1 {
	public void display() {
		System.out.println("iam an animal");
		
	}

}
class dog extends Animal_1
{
	public void display() {
		System.out.println("iam a dog");
		
	}
	public void printMessage() {
		display();
		
	}
}
class Main4{

	public static void main(String[] args) {
		dog dog1=new dog();
	}
}

	

