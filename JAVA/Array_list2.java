package Day5;
import java.util.Map;
import java.util.TreeMap;

public class Array_list2 {
	public static void main(String[] args) {
		Map<String,Integer>values=new TreeMap<>();
		values.put("second", 2);
		values.put("first", 1);
		System.out.println("map using TreeMap:"+ values);
		values.replace("first", 11);
		values.replace("second", 22);
		System.out.println("new Map:" + values);
		int removedValue=values.remove("first");
		System.out.println("removed value:"+ removedValue);
	}
	
				
	

}
