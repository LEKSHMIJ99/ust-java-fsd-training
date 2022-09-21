package Java_8;
interface Sayable2{
	void say();
}

public class MethodReference_3{
	
	public static void SaySomething(){
		
		System.out.println("hello,this is static method");
		
	}
	public static void main(String[] args) {
		Sayable2 sayable=MethodReference_3::saySomething;
		sayable.say();
	}

}


