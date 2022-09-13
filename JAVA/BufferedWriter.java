package Exception;
import java.io.FileWriter;


public class BufferedWriter {
	public BufferedWriter(FileWriter file) {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		String data="this is data in the output file";
		try {
			FileWriter file=new FileWriter("output.txt");
			BufferedWriter output=new BufferedWriter(file);
			output.write(data);
			output.close();
		}
		catch (Exception e) {
			e.getStackTrace();
		}
	}

	private void close() {
		// TODO Auto-generated method stub
		
	}

	private void write(String data) {
		// TODO Auto-generated method stub
		
	}
}