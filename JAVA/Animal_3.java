package Abstract_program;

public class Animal_3 {
public void display() {
	System.out.println("im an animal");
}
}
class Dog3 extends Animal_3{
	public void display() {
		System.out.println("im a dog");
	}
	public void printMessage() {
		display();
		super.display();
		
		
	}
}
class Main11{
	public static void main(String[] args) {
		Dog3 dog1=new Dog3();
		dog1.printMessage();
	}
}