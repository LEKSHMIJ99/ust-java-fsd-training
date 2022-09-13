package Exception;
import java.io.FileOutputStream;
import java.io.OutputStream;

public class Bytes {
	public static void main(String[] args) {
		String data="this is a line of text inside the file";
		try {
			OutputStream out=new FileOutputStream("output.txt");
			byte[] dataBytes=data.getBytes();
			out.write(dataBytes);
			System.out.println("data is written into the file");
			out.close();
		}
		catch(Exception e) {
			e.getStackTrace();
		}
	}

}
