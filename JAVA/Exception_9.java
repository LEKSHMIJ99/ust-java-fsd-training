package Exception;
import java.io.FileOutputStream;
import java.io.BufferedOutputStream;

public class Exception_9 {
	public static void main(String[] args){
		String data="this is a line of txt inside the line";
		try {
			FileOutputStream file=new FileOutputStream("output.txt");
			BufferedOutputStream output=new BufferedOutputStream(file);
			byte[] array=data.getBytes();
			output.write(array);
			output.close();
		}
		catch (Exception e) {
			e.getStackTrace();
			
		}
	}
	

}
