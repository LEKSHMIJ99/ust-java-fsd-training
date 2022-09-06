package Abstract_program;
interface A{
	void funcA();
	
	
}
interface B extends A{
	void funcB();
}
class C implements B{
	public void funcA() {
		
		System.out.println("this is funcA ");
		
	}
	public void funcB() {
		System.out.println("this is funcB");
	}

}
 class Demo {
	public static void main(String[] args) {
		C obj=new C();
		obj.funcA();
		obj.funcB();
	}
}