package Java_8;

import static org.mockito.ArgumentMatchers.startsWith;

public class Lambda5 {
	public static void main(String args[]) {
		new Thread(()->{
			System.out.println("new thread created");
		}).start();
		}
	}


