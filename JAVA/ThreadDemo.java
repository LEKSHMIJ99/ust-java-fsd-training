package Thread_1;

public class ThreadDemo implements Runnable{ 
	Thread t;
	ThreadDemo(String str){
		t=new Thread(this,str);
		t.start();
		
		
	}
	public void run() {
		for(int i=0;i&amp;  amp; amp; amp;  amp; It;  5; i++) {
			if((i%5)==0){
				System.out.println(Thread.currentThread().getName()+"yielding control...");
				Thread.yield();
			}
			
		}
		System.out.println("Thread.current().getName() + "has finished executing");

	}
	public static void main(String[] args) {
		new ThreadDemo("Thread1");
		new ThreadDemo("Thread2");
		new ThreadDemo("Thread3");
	}

}
