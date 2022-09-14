package Thread_1;

public class Thread1_1  implements Runnable{
	public static void main(String[] args) {
		Thread Thread1_1=new Thread("guru1");
		Thread Thread2=new Thread("guru2");
		Thread1_1.start();
		Thread2.start();
		System.out.println("Thread names are following");
		System.out.println(Thread1_1.getName());
		System.out.println(Thread2.getName());
		
			
	
	}
	public void run() {
		
	}

}
