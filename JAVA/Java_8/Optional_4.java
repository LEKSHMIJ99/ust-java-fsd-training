package Java_8;
import java.util.Optional;

public class Optional_4 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Optional<String>str=Optional.of("one");
		System.out.println(str.orElse("default value"));
	Optional<String>str1=Optional.empty();
	System.out.println(str1.orElse("Defaut value"));

	}

}
