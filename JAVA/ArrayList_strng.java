package Day5;
import java.util.ArrayList;

class ArrayList_strng {
	public static void main(String[] args) {
		ArrayList<String>languages=new ArrayList<>();
		languages.add("java");
		languages.add("kotlin");
		languages.add("c++");
		System.out.println("ArrayList:"+ languages);
		languages.set(2, "javascript");
		System.out.println("modified arrayList:"+ languages);
	}
	

}
