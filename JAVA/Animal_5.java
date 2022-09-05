package com.ust;

public class Animal_5 {
	Animal_5(){
		System.out.println("iam an animal");}
		Animal_5(String type){
			
		}
	}
class dog9 extends Animal_5{
	dog9(){
		super("Animal");
		System.out.println("im a dog");
		
	}
}
class Main9{
	public static void main(String[] args) {
		dog9 dog1=new dog9();
	}
}
	



