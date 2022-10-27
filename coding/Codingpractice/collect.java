package Codingpractice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collect {
	public static void main(String [] args)
	{
		List<Integer>Mylist=new ArrayList<Integer>();
		Mylist.add(1);
		Mylist.add(2);
		Mylist.add(3);
		Mylist.add(4);
		
		System.out.println("orginalLIST:"+ Mylist);
		Collections.reverse(Mylist);
		System.out.println("modiifiedList:" + Mylist);
	}

}
