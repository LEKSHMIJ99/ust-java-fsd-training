package Exception;
import java.io.File;

public class Deletefile {
	public static void main(String[] args) {
		File file=new File("file.txt");
		boolean value=file.delete();
		if(value) {
			System.out.println("the file is deleted");
		}
		else {
			System.out.println("the file is not deleted");
		}
	}

}
