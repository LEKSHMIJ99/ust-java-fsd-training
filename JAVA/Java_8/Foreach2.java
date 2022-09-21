package Java_8;
import java.util.ArrayList;
import java.util.List;


public class Foreach2 {
	public static void main(String[] args) {
		List<String>gamesList=new ArrayList<String>();
		gamesList.add("Football");
		gamesList.add("cricket");
		gamesList.add("chess");
		gamesList.add("hockey");
System.out.println("---------");
gamesList.forEach(System.out::println);
	}

}
