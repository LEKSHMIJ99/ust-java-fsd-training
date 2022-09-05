package com.ust;

public class Animal_3 {
	protected String type="animal";
	

}
class dog2 extends Animal_3{
	public String type="mammal";
	public void printType() {
		System.out.println("i am a" + type);
		System.out.println("i am an"+ super.type);
	}
}
class Main11
{
	public static void main(String[] args) {
		dog dog2=new dog();
		dog2.printMessage();
	}
}