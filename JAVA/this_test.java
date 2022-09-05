package com.ust;

public class this_test {
	int val1;
	int val2;
	this_test(int val1,int val2){
		this.val1=val1+val1;
		this.val2=val2+val2;
		this.val2=val2+val2;
	}
	void display(){
		System.out.println("value val1="+val1+"value val2="+val2);
	}
	
	}
class Main{
	
	public static void main(String[] args) {
		this_test object= new this_test(5,10);
		object.display();
	}
}
