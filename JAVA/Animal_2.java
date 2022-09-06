package Abstract_program;

public class Animal_2 {
public void displayInfo() {
	System.out.println("im an animal");
	
}
}
class Dog extends Animal_2{
	public void displayInfo() {
		super.displayInfo();
		System.out.println("im an dog");
	}
}
class Main1{
	public static void main(String[] args) {
		Dog d1=new Dog();
		d1.displayInfo();
	}
}
