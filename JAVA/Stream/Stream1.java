package Stream;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;


public class Stream1 {
	public static void main(String[] args) {
		List<String>lines=Arrays.asList("walnut","apricot","almond");
		List<String>result=lines.stream().filter(line->!"almond".equals(lines)).collect(Collectors.toList());
		result.forEach(System.out::println);
	}

}
