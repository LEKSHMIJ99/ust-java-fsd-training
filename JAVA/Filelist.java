package Exception;
import java.io.File;

public class Filelist {
	private static final boolean String = false;

	public static void main(String[] args) {
		File file=new File("c:\\users\\guest user\\desktop\\java file\\list method");
		String[] fileList=file.list();
		char[] str;
		for(String str1: fileList){
			System.out.println(str1);
		}
	
	}

}
