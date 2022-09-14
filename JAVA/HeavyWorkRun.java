package Thread_1;

public class HeavyWorkRun  implements Runnable{
	//@override
	public void run() {
		System.out.println("doing  heavy processing-START"+ Thread.currentThread().getName());
		try {
			Thread.sleep(1000);
			doDBProcessing();
			
		}
		catch(InterruptedException e) {
			e.printStackTrace();
		}
		System.out.println("Doing heavy processing-END"+ Thread.currentThread().getName());
	}

	private void doDBProcessing()throws InterruptedException{
		Thread.sleep(5, 000);
		
	}
public static void main(String[] args) {
	HeavyWorkRun h=new HeavyWorkRun();
	h.run();
}

}