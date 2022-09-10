package Day5;
import java.util.Map;
import java.util.HashMap;

public class Map_elements {
	public static void main(String[] args) {
		Map<String,Integer>numbers=new HashMap<>();
		numbers.put("one", 1);
		numbers.put("two", 2);
		System.out.println("Map:"+ numbers);
		System.out.println("keys:"+ numbers.keySet());
		System.out.println("values:"+ numbers.values());
		System.out.println("Entries:"+ numbers.entrySet());
		int value=numbers.remove("two");
		System.out.println("removed value:"+ value);
		
		
	}

}