package Java_8;
import java.util.Optional;

public class Optional_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String>optional=Optional.of("Hello");
		if(optional.isPresent()) {
			String value=optional.get();
			System.out.println("Optional value:"+ value);
			
			
		}
		else {
			System.out.println("optional has no value");
		}

	}

}
