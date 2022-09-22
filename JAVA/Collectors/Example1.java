package Collectors;
import java.util.List;
import java.util.ArrayList;


 class Example1 {
	int id;
	String name;
	int age;
	public Example1(int id,String name,int age) {
		this.id=id;
		this.name=name;
		this.age=age;
		
	}

}
public class Example21{
	public static void main(String[] args){
		List<Example1>studentlist=new ArrayList<Example1>();
		studentlist.add(new Example1(11,"jon",22));
		studentlist.add(new Example1(22,"jon",18));
		studentlist.add(new Example1(33,"LUCY",22));
		studentlist.add(new Example1(44,"SANSA",23));
		studentlist.add(new Example1(55,"MAGGIE",18));
		List<String>names=(List<String>) studentlist.stream().map(n->n.name);
		System.out.println(names);
	}
}
		
		
		
		
		
		
		
	

