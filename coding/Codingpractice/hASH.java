package Codingpractice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class hASH {
	public static void main(String [] args){
		Map<String,String>input_Map=new HashMap<String,String>();
	input_Map.put("1", "java");
	input_Map.put("2", "python");
	input_Map.put("3", "sql");
	System.out.println("THe hashmaps are declared");
		System.out.println("The elements of hashmap are:");
		for(Map.Entry<String, String> set:input_Map.entrySet());


	}
}