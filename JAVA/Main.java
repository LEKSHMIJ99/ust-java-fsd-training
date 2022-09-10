package Day5;

public class Main {
	public static void main(String[] args) {
		DemoClass demo=new DemoClass();
		demo.<String>genericsMethod("java programming");
		demo.<Integer>genericsMethod(25);
		
		
	}

}
class DemoClass{
	public<T> void genericsMethod(T data) {
		System.out.println("Generics Method:");
		System.out.println("Data passed:"+ data);
	}
}
class GenericsClass<T extends Number>{
	public void display() {
		System.out.println("this is a bounded type generics class.");
	}

	public void set(String string) {
		// TODO Auto-generated method stub
		
	}

	public Object get() {
		// TODO Auto-generated method stub
		return null;
	}


	
}