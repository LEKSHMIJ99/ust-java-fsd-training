package Java_8;



interface Sayable3{
	default void say(){
		System.out.println("hello this is default method");
	}
	
	void sayMore(String msg ) ;
static void sayLouder(String msg) {
		System.out.println(msg);
	}
		
		
	}
public abstract class DefaultMethods2 implements Sayable3 {
	public void sayMore(String msg) {
		System.out.println(msg);
	}
	public static void main(String[] args) {
		DefaultMethods dm=new DefaultMethods();
		dm.say();
		dm.sayMore("work is workshop");
		Sayable3.sayLouder("hello");
	}
}
	


