package com.ust;

 public  class Overrdidingexample2  extends super1 {
	final int x=5;
	int y;
	/*void display();{
	    System.out.println("in final");

	}*/
	public static void main(String[] args) {
		Overrdidingexample2 s=new Overrdidingexample2();
		//s=x=7;
		s.y=10;
		System.out.println(s.z);
     	//	System.out.println(s.display());
		s.display();
	}

}



   class super1{
	  final int z=10;
	  final void display() {
		  System.out.println("in display");
		  
	  }
	  void display (int x) {
		  System.out.println("*");
		  
		  
	  }
	
}
