package Java3;


public class FinalDemo_3 {
	public void display() {
		System.out.println("this is a final method");
	}

}
class Main6 extends FinalDemo_3{
	public final void display() {
		System.out.println("the final methd is overridden");
	}
	
	public static void main(String[] args) {
		Main6 obj=new Main6();
		obj.display();
	}
}