package Abstract_program;

abstract class Motorbike {
	abstract void brake();
	
	

}
class SportsBike extends Motorbike{
	public void brake() {
		System.out.println("SportsBike Brake");
		
	}
	
}
class MountainBike extends Motorbike{
	public void brake() {
		System.out.println("Mountain Brake");
		
	}
}
class Main9{
	public static void main(String[] args) {
		MountainBike m1=new MountainBike();
		m1.brake();
		SportsBike s1=new SportsBike();
		s1.brake();
	}
}

	

