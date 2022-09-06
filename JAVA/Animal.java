package Abstract_program;

abstract class Animal {
	abstract void makeSound();
	public void eat() {
		System.out.println("i can eat");
	}

}
class Dog1 extends Animal{
	public void makeSound() {
		System.out.println("bark bark");
	}
	
}
class Main7 {
	public static void main(String[] args) {
		Dog1 d1=new Dog1();
		d1.makeSound();
		d1.eat();
	}
}
