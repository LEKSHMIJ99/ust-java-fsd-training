package com.ust;
 class Overriding {}
 class B extends Overriding{}
  class C {
  
	  public static void main(String[] args) {
		  B objOfClassB=new B();
		  System.out.println("objOfClassB is an instance of B:" +(objOfClassB instanceof B));
		  System.out.println("objOfClassB is an instanceof the parent class A:" +(objOfClassB instanceof Overriding));
		  
		  
	  }

}
