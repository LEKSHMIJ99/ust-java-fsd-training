package com.ust;

public class Animal_4 {
	Animal_4(){
		System.out.println("i am an animal");
	}

}
class dog4 extends Animal_4{
	dog4 (){
		super();
		System.out.println("i am a dog");
		
	}
}
class main00{
	public static void main(String[] args) {
		dog4 dog=new dog4();
	}
}

