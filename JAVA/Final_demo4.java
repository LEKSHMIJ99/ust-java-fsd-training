package Java3;

 public class Final_demo4 {
	public void display() {
		System.out.println("this is a final method");
		
	}

}
class Main67 extends Final_demo4{
	public void display() {
		System.out.println("the final method is overridden");
	}
	public static void main(String[] args) {
		Main67 obj=new Main67();
		obj.display();
	}
}
