package com.ust;

public class Test_this2 {
int val_a;
int val_b;
Test_this2()
{
	val_a=10;
	val_b=20;
	
}
Test_this2 get()
{
	return this;
}
void display()
{
	System.out.println("val_a="+val_a+" val_b="+val_b);
	
}
}
class Main0{
	public static void main(String[] args) {
		Test_this2 object=new Test_this2();
		object.get().display();
		
		
	}
}
