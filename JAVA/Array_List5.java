package Day5;
import java.util.LinkedHashMap;

public class Array_List5 {
	public static void main(String[]args) {
		LinkedHashMap<String,Integer>evenNumbers=new LinkedHashMap<>();
		evenNumbers.put("two",2);
		evenNumbers.put("four", 4);
		System.out.println("LinkedHashMap1:"+ evenNumbers);
		LinkedHashMap<String,Integer>numbers=new LinkedHashMap<>(evenNumbers);
		numbers.put("three", 3);
		System.out.println("LinkedHashMap2:"+ numbers);
		
	}

}
