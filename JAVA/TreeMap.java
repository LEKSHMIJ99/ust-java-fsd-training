package Day5;
import java.util.TreeMap;

class TreeMap_num {
	public static void main(String[] args) {
		TreeMap<String,Integer>evenNumbers=new TreeMap<>();
		evenNumbers.put("two",2);
		evenNumbers.put("four",4);
		evenNumbers.putIfAbsent("six",6);
		System.out.println("TreeMap of even numbers:"+ evenNumbers);
		TreeMap<String,Integer>numbers=new TreeMap<>();
		numbers.put("one",1);
		numbers.putAll(evenNumbers);
		System.out.println("treeMap of numbers:"+ numbers);
		
	}
	

}
