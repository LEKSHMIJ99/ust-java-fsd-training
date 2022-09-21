package Java_8;

public class MethodReference {
	public void printMsg() {
		System.out.println("hello,this is instance method");
	}
	public static void main(String[] args) {
		Thread t2=new Thread(new MethodReference()::printnMsg);
		t2.start();
	
	}

}