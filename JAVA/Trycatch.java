package Exception;
import java.io.File;

public class Trycatch {
	

	public static void main(String[] args) {
     File file= new File("newFile.txt");
     try {
		
	boolean value= file.createNewFile();
if(value) {
	System.out.println("the new file is created");
}
else {
	System.out.println("the file already exist");
}

}
	catch(Exception e) {
		e.getStackTrace();
	}


}
}

