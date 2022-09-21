package Java_8;


public class Java8Tester{
	public static void main(String[] args) {
		Vehicle vehicle=new Car();
		vehicle.print();
		
	}
	

}
interface Vehicle{
	default void print() {
		System.out.println("i am a vehicle");
	}
	static void blowHorn() {
		System.out.println("blowing horn");
		
	}
}
interface Fourwheeler{
	default void print() {
		System.out.println("am a four wheel");
	}
}
class Car implements Vehicle,Fourwheeler {
	
	public void print() {
		Vehicle.super.print();
		Fourwheeler.super.print();
		Vehicle.blowHorn();
		System.out.println("im a car");
		
			
		}

	}

