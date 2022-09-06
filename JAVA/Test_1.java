package Abstract_program;

public class Test_1 {
	int a;
	int b;
	Test_1(){
		a=10;
		b=20;
	}
	Test_1 get()
	{
		return this;
	}
	void display()
	{
		System.out.println("a=" + a +"b=" +b);
	}
	public static void main(String[] args) {
		Test_1 object=new Test_1();
		object.get().display();
	}

}
