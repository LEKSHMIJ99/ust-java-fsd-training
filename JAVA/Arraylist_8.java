package Day5;
import java.util.ArrayList;
import java.util.Iterator;

 class Arraylist_8 {
	 public static void main(String[] args) {
		 ArrayList<Integer>numbers=new ArrayList<>();
		 numbers.add(3);
		 numbers.add(2);
		 System.out.println("ArrayList:"+ numbers);
		 Iterator<Integer>iterate=numbers.iterator();
		 int number=iterate.next();
		 System.out.println("accessed element:"+ number);
		 iterate.remove();
		 System.out.println("removed element:"+ number);
		 System.out.println("updated ArrayList:");
		 while(iterate.hasNext()) {
			 iterate.forEachRemaining((value)->System.out.println(value+","));
		 }
		 
	 }

}
