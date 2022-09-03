package com.ust;

public class Thisfunction {
 static int x=1;
 private int y=3;
 public void method1(int x) {
	 
	 Thisfunction t =new Thisfunction();
	 this.x=2;
	 y=4;
	 System.out.println("Test1.x"+ Thisfunction.x);
	  System.out.println("t.x:"+ t.x);
	  System.out.println("t.y;"+ t.y);
	  System.out.println("y:"+ y);
 }
 public static void main(String args[])
 {
	 Thisfunction t=  new Thisfunction();
	 t.method1(5);
	 
 }
}
	  