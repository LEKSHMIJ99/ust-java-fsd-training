package Java_8;

public class Methodreference2 {
	public static void ThreadStatus() {
		System.out.println("thread is running");
		
	}
	public static void main(String[] args) {
		Thread t2=new Thread(Methodreference2:: ThreadStatus);
		t2.start();
		
	}
	

}
