package Java_8;
interface TestInterface{
	public void square(int a);
	
default void show() {
	System.out.println("default method executed");
}
}
class TestClass  implements TestInterface{
	public void square(int a)
	{
		System.out.println(a*a);
	}
	TestClass d=new TestClass();
	d.square(4);
	//default method executed
	d.show();
	
	
	
	

}


