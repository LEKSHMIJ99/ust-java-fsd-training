package Java_8;
interface Sayable{
	default void say() {
		System.out.println("hello, this is default method");
	}
	void sayMore(String msg);
		

}

public class DefaultMethods implements Sayable {
	public void sayMore(String msg) {
		DefaultMethods dm=new DefaultMethods();
		dm.say();
		dm.sayMore("work is workship");
	}
	

}
