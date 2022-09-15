package Enums;

import Abstract_program.Test;

enum Size1{
	SMALL,
	MEDIUM,
	LARGE,
	EXTRALARGE;

	void orderPizza() {
		// TODO Auto-generated method stub
		
	}
	
}

public class Test000 {
	Size pizzaSize;
	public Test000(Size pizzaSize) {
		this.pizzaSize=pizzaSize;
	}
	public void orderPizza() {
		switch(pizzaSize) {
		case SMALL:
			System.out.println("I ORDERED A SMALL SIZE PIZZA");
			break;
		case MEDIUM:
			System.out.println("i ordered a medium sized pizza");
		break;
		default:
			System.out.println("i dont know whicg one to order break");
			
		}
	}
}
class Main{
	public static void main(String[] args) {
		Test000 t1=new Test000(Size.MEDIUM);
		 t1.orderPizza();
	}
}

			
	
	
	
	
	


