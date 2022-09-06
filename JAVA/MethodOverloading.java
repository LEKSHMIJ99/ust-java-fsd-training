package Abstract_program;

public class MethodOverloading {
	private static void display(int a) {
		System.out.println("got Integer data");
	}
	private static void display(String a) {
		System.out.println("Got String object");
	}
public static void main(String[] args) {
	display(1);
	display("hello");
}
}
