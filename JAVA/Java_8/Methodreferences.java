package Java_8;
import java.util.List;
import java.util.ArrayList;

public class Methodreferences {
	public static void main(String[] args) {
		List names=new ArrayList();
		names.add("mahesh");
		names.add("suresh");
		names.add("ramesh");
		names.add("naresh");
		names.add("mahesh");
		names.forEach(System.out::println);
	}

}
