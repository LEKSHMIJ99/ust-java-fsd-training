package com.ust;

public class This_construct {
	int val1;
	int val2;
	This_construct()
	{
		this(10,20);
		System.out.println("default constructor");
		
	}
	This_construct(int val1, int val2)
	{
		this.val1=val1;
		this.val2=val2;
		System.out.println("parameterised constructor");
	}

}
class Main5{
	public static void main(String[] args)
	{
		This_construct object=new This_construct();
	}
}
	


